package oopsPracticeQuestions.february9;


//Transport System: Vehicle <-super class Car, Bike, Bus
// methods-->start(), stop(), fuel_type()

public class Vehicle {
    String VehicleNumber;

    Vehicle(String VehicleNumber){
        this.VehicleNumber= VehicleNumber;
    }

    void start() {
        System.out.println("Vehicle is starting ");
    }

    void stop() {
        System.out.println("Vehicle stop ");
    }

    String fuelType(String type) {
        return type;

    }
}
 class Car extends Vehicle{
     Car(String VehicleNumber) {
         super(VehicleNumber);
     }

     @Override
     void start(){
         super.start();
     }
     @Override
     void stop(){
         super.stop();
     }
     @Override
     String fuelType(String type){
          return super.fuelType(type);
     }


 }

class Bus  extends Vehicle{
    Bus(String VehicleNumber) {
        super(VehicleNumber);
    }

    @Override
    void start(){
        super.start();
    }
    @Override
    void stop(){
        super.stop();
    }
    @Override
    String fuelType(String type){
        return super.fuelType(type);
    }
    void capacity() {
        System.out.println("Bus can carry 80 passengers.");
    }


}