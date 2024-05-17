package org.example;

public class Main {

    public static void main(String[] args) {
        ParkingCalculation(25);
        ParkingCalculation(26);
        ParkingCalculation(9);
        ParkingCalculation(8);
    }

    public static void ParkingCalculation(int hours){
        float parkingFees;
        if (hours <24){
            parkingFees = FiveHours(hours);
            System.out.println("$"+parkingFees);
        }else{
            parkingFees = TwentyFourHours(hours);
            System.out.println("$"+parkingFees);
        }
    }

    public static float FiveHours(int hoursAmount){
        float parkingFees;
        int hours;

        if (hoursAmount>5){
            hours = hoursAmount-5;
            parkingFees = (float) (1+(hours *0.5));
        }else{
            parkingFees = (float) 1;
        }
        return parkingFees;
    }

    public static float TwentyFourHours(int hoursAmount){
        float parkingFees;
        int hours;

        if (hoursAmount>24){
            hours = hoursAmount-24;
            parkingFees = (float) (15+(hours *0.5));
        }else{
            parkingFees = (float) 15;
        }
        return parkingFees;
    }
}

/*
$15.5
$16.0
$3.0
$2.5
*/