package org.example;

// Toyota Fortuner class (inherits from Car)
class ToyotaFortuner extends Car {
    public ToyotaFortuner(int numberOfDoors, double fuelTankCapacity, String transmissionType) {
        super(numberOfDoors, fuelTankCapacity, transmissionType);
    }

    public void CanMoveForward() {
        System.out.println("The Toyota Fortuner move forward");
    }

    public void CanTurn() {
        System.out.println("The Toyota Fortuner turn");
    }

    public void Description(){
        System.out.println("Wheels: "+wheels);
        System.out.println("Number of Doors: "+numberOfDoors);
        System.out.println("Fuel Tank Capacity: "+fuelTankCapacity);
        System.out.println("Transmission Type: "+transmissionType);
    }
}