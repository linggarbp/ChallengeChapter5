package org.example;

// Honda Jazz class (inherits from Car)
class HondaJazz extends Car {
    public HondaJazz(int numberOfDoors, double fuelTankCapacity, String transmissionType) {
        super(numberOfDoors, fuelTankCapacity, transmissionType);
    }

    public void CanMoveForward() {
        System.out.println("The Honda Jazz move forward");
    }

    public void CanTurn() {
        System.out.println("The Honda Jazz turn");
    }

    public void Description(){
        System.out.println("Wheels: "+wheels);
        System.out.println("Number of Doors: "+numberOfDoors);
        System.out.println("Fuel Tank Capacity: "+fuelTankCapacity);
        System.out.println("Transmission Type: "+transmissionType);
    }
}