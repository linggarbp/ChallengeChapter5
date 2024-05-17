package org.example;

public class Main {

    public static void main(String[] args) {
        ParkingCalculation(24);
        ParkingCalculation(25);
        ParkingCalculation(26);
        ParkingCalculation(9);
        ParkingCalculation(8);
        ParkingCalculation(5);
    }

    public static void ParkingCalculation(int hours){
        float parkingFees;
        if (hours < 24){
            parkingFees = FiveHours(hours);
            System.out.println(hours + " hours = $" + parkingFees);
        }else{
            parkingFees = TwentyFourHours(hours);
            System.out.println(hours + " hours = $" + parkingFees);
        }
    }

    public static float FiveHours(int hoursAmount){
        float parkingFees;
        int hours;

        if (hoursAmount > 5){
            hours = hoursAmount - 5;
            parkingFees = (float) (1 + (hours * 0.5));
        }else{
            parkingFees = 1;
        }
        return parkingFees;
    }

    public static float TwentyFourHours(int hoursAmount){
        float parkingFees;
        int hours;

        if (hoursAmount > 24){
            hours = hoursAmount - 24;
            parkingFees = (float) (15 + (hours * 0.5));
        }else{
            parkingFees = 15;
        }
        return parkingFees;
    }
}

/*
24 hours = $15.0
25 hours = $15.5
26 hours = $16.0
9 hours = $3.0
8 hours = $2.5
5 hours = $1.0
*/