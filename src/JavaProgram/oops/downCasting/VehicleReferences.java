package JavaProgram.oops.downCasting;

import java.util.ArrayList;
import java.util.List;

public class VehicleReferences {
    List<Vehicle> list = new ArrayList<>();

    void addVehicle(Vehicle vehicle) {
        list.add(vehicle);
    }

    void rentVehicle(int days) {
        for (Vehicle vehicle : list) {
            if (vehicle != null) {
                double charge = 0;

                if (vehicle instanceof Car) {
                    Car c1 = (Car) vehicle;
                    charge = c1.calcCarRent(days);
                } else if (vehicle instanceof Bike) {
                    Bike b1 = (Bike) vehicle;
                    charge = b1.calcBikeRent(days);
                } else if (vehicle instanceof Vehicle) {
                    charge = vehicle.calcRent(days);
                }

                System.out.println("Vehicle number: " + vehicle.vehicleNumber + " total charges are " + charge);
            }
        }
    }
}
