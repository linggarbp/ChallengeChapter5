package org.example;

// Car class (inherits from Vehicle)
class Car extends Vehicle {
    protected int numberOfDoors;
    protected double fuelTankCapacity;
    protected String transmissionType;

    public Car(int numberOfDoors, double fuelTankCapacity, String transmissionType) {
        wheels = 4;
        this.numberOfDoors = numberOfDoors;
        this.fuelTankCapacity = fuelTankCapacity;
        this.transmissionType = transmissionType;
    }

    private void CanMoveForward() {
        System.out.println("The car move forward");
    }

    private void CanTurn() {
        System.out.println("The car turn");
    }
}
