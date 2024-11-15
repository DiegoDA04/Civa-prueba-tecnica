import React from 'react';
import { Bus } from '../models/bus';
import { X } from 'lucide-react';

interface BusDetailsProps {
  bus: Bus;
  onClose: () => void;
}

export function BusDetails({ bus, onClose }: BusDetailsProps) {
  return (
    <div className="fixed inset-0 bg-gray-600 bg-opacity-50 overflow-y-auto h-full w-full flex items-center justify-center">
      <div className="relative bg-white rounded-lg shadow-xl max-w-md w-full mx-4">
        <div className="flex justify-between items-center p-4 border-b">
          <h3 className="text-lg font-semibold text-gray-900">Detalles del Bus</h3>
          <button
            onClick={onClose}
            className="text-gray-400 hover:text-gray-500"
          >
            <X className="h-6 w-6" />
          </button>
        </div>
        
        <div className="p-6">
          <dl className="space-y-4">
            <div>
              <dt className="text-sm font-medium text-gray-500">Número</dt>
              <dd className="mt-1 text-sm text-gray-900">{bus.numero}</dd>
            </div>
            
            <div>
              <dt className="text-sm font-medium text-gray-500">Placa</dt>
              <dd className="mt-1 text-sm text-gray-900">{bus.placa}</dd>
            </div>
            
            <div>
              <dt className="text-sm font-medium text-gray-500">Marca</dt>
              <dd className="mt-1 text-sm text-gray-900">{bus.nombreMarca}</dd>
            </div>
            
            <div>
              <dt className="text-sm font-medium text-gray-500">Fecha de Creación</dt>
              <dd className="mt-1 text-sm text-gray-900">
                {new Date(bus.fechaCreacion).toLocaleDateString()}
              </dd>
            </div>
            
            <div>
              <dt className="text-sm font-medium text-gray-500">Características</dt>
              <dd className="mt-1 text-sm text-gray-900">{bus.caracteristicas}</dd>
            </div>
            
            <div>
              <dt className="text-sm font-medium text-gray-500">Estado</dt>
              <dd className="mt-1">
                <span className={`px-2 inline-flex text-xs leading-5 font-semibold rounded-full ${
                  bus.estado === 'ACTIVO' ? 'bg-green-100 text-green-800' : 'bg-red-100 text-red-800'
                }`}>
                  {bus.estado}
                </span>
              </dd>
            </div>
          </dl>
        </div>
      </div>
    </div>
  );
}