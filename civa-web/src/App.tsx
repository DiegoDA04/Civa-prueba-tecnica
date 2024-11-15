import React, { useState, useEffect } from 'react';
import { Bus } from './models/bus';
import { BusTable } from './components/BusTable';
import { BusDetails } from './components/BusDetails';
import { Bus as BusIcon, Loader2 } from 'lucide-react';

const ITEMS_PER_PAGE = 10;

function App() {
  const [buses, setBuses] = useState<Bus[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);
  const [currentPage, setCurrentPage] = useState(1);
  const [totalPages, setTotalPages] = useState(0);
  const [selectedBus, setSelectedBus] = useState<Bus | null>(null);

  useEffect(() => {
    fetchBuses(currentPage);
  }, [currentPage]);

  const fetchBuses = async (page: number) => {
    setLoading(true);
    try {
      const response = await fetch(`http://localhost:8080/api/v1/buses?page=${page - 1}&size=${ITEMS_PER_PAGE}`);
      if (!response.ok) {
        throw new Error('Error al cargar los buses');
      }
      const data = await response.json();
      setBuses(data.content);
      setTotalPages(data.totalPages);
    } catch (err) {
      setError(err instanceof Error ? err.message : 'Error desconocido');
    } finally {
      setLoading(false);
    }
  };

  const handleViewDetails = async (bus: Bus) => {
    try {
      const response = await fetch(`http://localhost:8080/api/v1/buses/${bus.id}`);
      if (!response.ok) {
        throw new Error('Error al cargar los detalles del bus');
      }
      const detailedBus = await response.json();
      setSelectedBus(detailedBus);
    } catch (err) {
      setError(err instanceof Error ? err.message : 'Error al cargar los detalles');
    }
  };

  if (loading) {
    return (
      <div className="min-h-screen bg-gray-50 flex flex-col items-center justify-center">
        <Loader2 className="h-8 w-8 text-indigo-600 animate-spin" />
        <p className="mt-2 text-gray-600">Cargando buses...</p>
      </div>
    );
  }

  if (error) {
    return (
      <div className="min-h-screen bg-gray-50 flex flex-col items-center justify-center">
        <div className="bg-red-100 border border-red-400 text-red-700 px-4 py-3 rounded relative" role="alert">
          <strong className="font-bold">Error: </strong>
          <span className="block sm:inline">{error}</span>
        </div>
      </div>
    );
  }

  return (
    <div className="min-h-screen bg-gray-50 py-8">
      <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
        <div className="flex items-center justify-between mb-8">
          <div className="flex items-center">
            <BusIcon className="h-8 w-8 text-indigo-600" />
            <h1 className="ml-3 text-2xl font-bold text-gray-900">Civa</h1>
          </div>
        </div>

        <BusTable
          buses={buses}
          currentPage={currentPage}
          totalPages={totalPages}
          onPageChange={setCurrentPage}
          onViewDetails={handleViewDetails}
        />

        {selectedBus && (
          <BusDetails
            bus={selectedBus}
            onClose={() => setSelectedBus(null)}
          />
        )}
      </div>
    </div>
  );
}

export default App;
