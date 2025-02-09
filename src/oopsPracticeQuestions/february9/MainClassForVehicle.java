package oopsPracticeQuestions.february9;

import java.util.Scanner;

public class MainClassForVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle  number");
        String VehicleNumber = sc.nextLine();
        Car c=new Car(VehicleNumber);
        c.start();
        c.stop();
        System.out.println("Type of vehicle is: "+c.fuelType("Diesel"));

        Bus b=new Bus(VehicleNumber);
        b.start();
        b.stop();
        System.out.println("Type of vehicle is: "+b.fuelType("Electric"));
        b.capacity();



    }
}
