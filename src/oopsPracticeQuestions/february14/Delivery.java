package oopsPracticeQuestions.february14;

import java.util.Scanner;

/*5. Food Delivery Service
Design a food delivery system where different delivery options (BikeDelivery, DroneDelivery)
inherit from a base Delivery class.
calculateDeliveryTime(): A method to estimate the time required for delivery. This would be overridden in each
derived class to provide delivery-time calculations specific to the mode of transport.
calculateDeliveryFee(): A method to calculate the delivery cost based on distance, time, and mode of transport.
 It would also be overridden in each subclass.
trackDelivery(): Provides real-time tracking of the delivery status.
getDeliveryDetails(): Returns details about the delivery, such as the type of delivery, estimate
// */
abstract class Delivery {
    abstract double calculateTime();

    abstract double calculateFees();

    void trackDelivery() {
        System.out.println("Tracking delivery ");
    }

    void getDeliveryDetails() {
        double time=calculateTime();
        double fees=calculateFees();
        System.out.println("your order will take "+this.getClass().getSimpleName());
        System.out.println("Estimate time :"+time+" mins");
        System.out.println("total  delivery fees: "+fees);
    }
}

class BikeDelivery extends Delivery {
private  double distance;
    @Override
    double calculateTime() {
         this.distance = getDistanceToDestinationForBike();
        double speed = 15;
        double time = (distance / speed) * 60;
        return time;
    }

    @Override
    double calculateFees() {
        double baseFees=5;
        double fee = baseFees + (distance * 1);
        return  fee;
    }

   private  double getDistanceToDestinationForBike(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance to destination for bike Delivery: ");
        double distanceOfUser = scanner.nextDouble();
        if (distanceOfUser <= 0) {
            System.out.println("Invalid");
            distanceOfUser = 1;
        }

        return distanceOfUser;
    }
}

class DroneDelivery extends Delivery {
    private  double distance;

    @Override
    double calculateTime() {
        this.distance = getDistanceToDestinationForDrone();
        double speed = 25;
        double time = (distance / speed) * 60;
        return time;
    }

    @Override
    double calculateFees() {
        double baseFees=25;
        double fee = baseFees + (distance * 1);
        return  fee;
    }

    private  double getDistanceToDestinationForDrone(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance to destination for Drone Delivery: ");
        double distanceOfUser = scanner.nextDouble();
        if (distanceOfUser <= 0) {
            System.out.println("Invalid");
            distanceOfUser = 1;
        }

        return distanceOfUser;
    }
}