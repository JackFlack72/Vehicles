package com.pluralsight;

import java.util.ArrayList;

public class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private ArrayList<Wheel> wheels = new ArrayList<>();

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("color='").append(color).append('\'');
        sb.append(", numberOfPassengers=").append(numberOfPassengers);
        sb.append(", cargoCapacity=").append(cargoCapacity);
        sb.append(", fuelCapacity=").append(fuelCapacity);
        sb.append(", wheels=").append(wheels);
        sb.append('}');
        return sb.toString();
    }
}
