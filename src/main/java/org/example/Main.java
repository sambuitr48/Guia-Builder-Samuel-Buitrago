package org.example;

/**
 * Clase principal que ejecuta el ejemplo del patrón Builder.
 */
public class Main {
    public static void main(String[] args) {
        VehicleBuilder builder = new ConcreteVehicleBuilder();
        VehicleDirector director = new VehicleDirector(builder);

        Vehicle car = director.constructCar();
        System.out.println(car);

        Vehicle bicycle = director.constructBicycle();
        System.out.println(bicycle);
    }
}