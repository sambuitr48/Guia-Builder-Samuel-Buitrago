package org.example;

/**
 * Implementación concreta de la interfaz VehicleBuilder.
 * Esta clase se encarga de construir un vehículo especificando cada uno de sus componentes.
 */
public class ConcreteVehicleBuilder implements VehicleBuilder {
    private String type; // Tipo de vehículo a construir
    private int wheels; // Número de ruedas a construir
    private String color; // Color del vehículo a construir
    private String model; // Modelo del vehículo a construir

    @Override
    public VehicleBuilder setType(String type) {
        this.type = type; // Asigna el tipo de vehículo proporcionado
        return this; // Retorna la instancia para permitir el encadenamiento
    }

    @Override
    public VehicleBuilder setWheels(int wheels) {
        this.wheels = wheels; // Asigna el número de ruedas
        return this; // Retorna la instancia para permitir el encadenamiento
    }

    @Override
    public VehicleBuilder setColor(String color) {
        this.color = color; // Asigna el color del vehículo
        return this; // Retorna la instancia para permitir el encadenamiento
    }

    @Override
    public VehicleBuilder setModel(String model) {
        this.model = model; // Asigna el modelo del vehículo
        return this; // Retorna la instancia para permitir el encadenamiento
    }

    @Override
    public Vehicle build() {
        // Crea y retorna una nueva instancia de Vehicle con los valores configurados
        return new Vehicle(type, wheels, color, model);
    }
}
