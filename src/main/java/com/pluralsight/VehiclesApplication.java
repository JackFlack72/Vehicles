package com.pluralsight;

public class VehiclesApplication {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Pink");
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(2);
        slowRide.setFuelCapacity(5);

        Car fastRide = new Car();
        fastRide.setColor("Red");
        fastRide.setNumberOfPassengers(2);
        fastRide.setCargoCapacity(10);
        fastRide.setFuelCapacity(30);

        SemiTruck bigRide = new SemiTruck();
        bigRide.setColor("Green");
        bigRide.setNumberOfPassengers(2);
        bigRide.setCargoCapacity(100);
        bigRide.setFuelCapacity(300);

        Hovercraft waterRide = new Hovercraft();
        waterRide.setColor("Blue");
        waterRide.setNumberOfPassengers(2);
        waterRide.setCargoCapacity(8);
        waterRide.setFuelCapacity(40);
    }
}
