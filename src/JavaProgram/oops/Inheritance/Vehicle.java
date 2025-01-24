package JavaProgram.oops.Inheritance;

/*
* Vehicle Management System
Consider different types of vehicles, such as a basic vehicle, a car, and a motorcycle.
*  All vehicles can be started and stopped and have a speed. However, cars and motorcycles
*  have specific properties and behaviors. Let us see how we can implement this example using
*  the Inheritance .*/

public class Vehicle {
    int speed=50;

    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle Stopped");
    }

}

class Car extends Vehicle {

    int seat;
    int NoOfWindow;
    int window(){
     return NoOfWindow;
    }

    void FuelType() {

    }

    void sunRoof() {

    }
}

class MotorCycle extends Vehicle {

    void selfStart() {

    }
}

