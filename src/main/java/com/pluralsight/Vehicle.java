package com.pluralsight;

import java.util.ArrayList;

public class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private ArrayList<Wheel> wheels = new ArrayList<>();

    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Blue");
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(2);
        slowRide.setFuelCapacity(5);

        Car fastRide = new Car();
        fastRide.setColor("Red");
        fastRide.setNumberOfPassengers(2);
        fastRide.setCargoCapacity(10);
        fastRide.setFuelCapacity(30);

        SemiTruck bigRide = new SemiTruck();
        bigRide.setColor("Red");
        bigRide.setNumberOfPassengers(2);
        bigRide.setCargoCapacity(100);
        bigRide.setFuelCapacity(300);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
