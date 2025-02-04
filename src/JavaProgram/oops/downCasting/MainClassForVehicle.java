package JavaProgram.oops.downCasting;

public class MainClassForVehicle {
    public static void main(String[] args) {
        VehicleReferences vf = new VehicleReferences();

        Car car1 = new Car("Car123", 500, "Diesel");
        Bike bike1 = new Bike("Bike456", 200, true);

        vf.addVehicle(car1);
        vf.addVehicle(bike1);

        System.out.println("Rental charges for 5 day:");
        vf.rentVehicle(5);
    }
}
