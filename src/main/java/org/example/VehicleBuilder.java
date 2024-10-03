package org.example;
/**
 * Interfaz que define los métodos para construir un objeto Vehicle paso a paso.
 */
public interface VehicleBuilder {
    VehicleBuilder setType(String type); // Método para establecer el tipo de vehículo
    VehicleBuilder setWheels(int wheels); // Método para establecer el número de ruedas
    VehicleBuilder setColor(String color); // Método para establecer el color
    VehicleBuilder setModel(String model); // Método para establecer el modelo
    Vehicle build(); // Método para construir y devolver el objeto Vehicle
}

