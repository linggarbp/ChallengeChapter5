package org.example;

public class Main {
    public static void main(String[] args) {
        HondaJazz jazz = new HondaJazz(5, 40.0, "Automatic");
        ToyotaFortuner fortuner = new ToyotaFortuner(5, 80.0, "Manual");
        SuzukiKatana katana = new SuzukiKatana(2, 30.0, "Manual");

        // Example usage
        System.out.println("Honda Jazz specs:");
        jazz.Description();
        jazz.CanMoveForward();
        jazz.CanTurn();

        System.out.println("\nToyota Fortuner specs:");
        fortuner.Description();
        fortuner.CanMoveForward();
        fortuner.CanTurn();

        System.out.println("\nSuzuki Katana specs:");
        katana.Description();
        katana.CanMoveForward();
        katana.CanTurn();
    }
}

/*
Honda Jazz specs:
Wheels: 4
Number of Doors: 5
Fuel Tank Capacity: 40.0
Transmission Type: Automatic
The Honda Jazz move forward
The Honda Jazz turn

Toyota Fortuner specs:
Wheels: 4
Number of Doors: 5
Fuel Tank Capacity: 80.0
Transmission Type: Manual
The Toyota Fortuner move forward
The Toyota Fortuner turn

Suzuki Katana specs:
Wheels: 4
Number of Doors: 2
Fuel Tank Capacity: 30.0
Transmission Type: Manual
The Suzuki Katana move forward
The Suzuki Katana turn
*/