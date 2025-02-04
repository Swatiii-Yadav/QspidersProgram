package JavaProgram.oops.downCasting;

/**
 * Problem 1: Vehicle Rental System
 * Scenario:
 * A vehicle rental system has a base class Vehicle and two derived classes Car and Bike.
 * The system maintains a list of rented vehicles using base class references (Vehicle).
 * However, when calculating rental charges, the system needs to use specific methods available
 * only in the Car or Bike class.
 * <p>
 * Task:
 * Implement the Vehicle class with basic attributes like vehicleNumber and rentPerDay.
 * Create Car and Bike classes that inherit from Vehicle and add specific attributes
 * (e.g., fuelType for Car, helmetIncluded for Bike).
 * Store a list of rented vehicles using base class (Vehicle references).
 * Downcast a Vehicle reference to Car or Bike while calculating rental charges based on their specific attributes.
 */

public class Vehicle {
    String vehicleNumber;
    double rentPerDay;

    public Vehicle(String vehicleNumber, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.rentPerDay = rentPerDay;
    }

    double calcRent(int days) {
        return rentPerDay * days;
    }

}

class Car extends Vehicle {
    String fuelType;

    Car(String vehicleNumber, double rentPerDay, String fuelType) {
        super(vehicleNumber, rentPerDay);
        this.fuelType = fuelType;

    }

    double calcCarRent(int days) {
        int extraChargePerDay = fuelType.contains("Diesel") ? 10 : 5;
        return super.calcRent(days) + extraChargePerDay * days;
    }
}

class Bike extends Vehicle {
    boolean helmetIncluded;

    Bike(String vehicleNumber, double rentPerDay, boolean helmetIncluded) {
        super(vehicleNumber, rentPerDay);
        this.helmetIncluded = helmetIncluded;

    }

    double calcBikeRent(int days) {
        int extraChargePerDay = helmetIncluded ? 10 : 5;
        return super.calcRent(days) + extraChargePerDay * days;
    }
}
