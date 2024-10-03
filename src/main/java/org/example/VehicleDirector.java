package org.example;

/**
 * Clase que dirige la construcción de objetos Vehicle.
 * Usa un builder para construir diferentes configuraciones de vehículos.
 */
public class VehicleDirector {
    private VehicleBuilder builder; // El builder usado para construir el vehículo

    /**
     * Constructor de VehicleDirector.
     *
     * @param builder El builder que se usará para construir los vehículos.
     */
    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    /**
     * Construye un coche.
     *
     * @return Objeto Vehicle configurado como coche.
     */
    public Vehicle constructCar() {
        return builder.setType("Car") // Establece el tipo de vehículo como coche
                .setWheels(4) // Establece que tiene 4 ruedas
                .setColor("Red") // Establece el color como rojo
                .setModel("Sedan") // Establece el modelo como Sedan
                .build(); // Construye y retorna el vehículo
    }

    /**
     * Construye una bicicleta.
     *
     * @return Objeto Vehicle configurado como bicicleta.
     */
    public Vehicle constructBicycle() {
        return builder.setType("Bicycle") // Establece el tipo de vehículo como bicicleta
                .setWheels(2) // Establece que tiene 2 ruedas
                .setColor("Blue") // Establece el color como azul
                .setModel("Mountain") // Establece el modelo como Mountain
                .build(); // Construye y retorna el vehículo
    }
}
