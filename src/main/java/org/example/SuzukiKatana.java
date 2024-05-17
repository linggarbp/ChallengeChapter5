package org.example;

// Suzuki Katana class (inherits from Car)
class SuzukiKatana extends Car {
    public SuzukiKatana(int numberOfDoors, double fuelTankCapacity, String transmissionType) {
        super(numberOfDoors, fuelTankCapacity, transmissionType);
    }

    public void CanMoveForward() {
        System.out.println("The Suzuki Katana move forward");
    }

    public void CanTurn() {
        System.out.println("The Suzuki Katana turn");
    }

    public void Description(){
        System.out.println("Wheels: "+wheels);
        System.out.println("Number of Doors: "+numberOfDoors);
        System.out.println("Fuel Tank Capacity: "+fuelTankCapacity);
        System.out.println("Transmission Type: "+transmissionType);
    }
}