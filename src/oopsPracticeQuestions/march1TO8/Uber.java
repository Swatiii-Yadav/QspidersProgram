package oopsPracticeQuestions.march1TO8;

import  java.util.*;

interface RideService {
    void calculateFare(double distance) throws  RideException;
    boolean bookRide(String source, String destination)throws  RideException; ;
    boolean confirmRide();
}


public class Uber  implements RideService {
     String source;
     String destination;
     double fare;
     boolean isRideConfirmed = false;

    @Override
    public void calculateFare(double distance) {
        fare = distance * 10; // Assuming ₹10 per km
        System.out.println("Estimated Fare: ₹" + fare);
    }

    @Override
    public boolean bookRide(String source, String destination) throws RideException {
        if (source.isEmpty() || destination.isEmpty()) {
            throw new RideException("Source or Destination cannot be empty.");
        }
        this.source = source;
        this.destination = destination;
        System.out.println("Ride booked from " + source + " to " + destination);
        return true;
    }
    @Override
    public boolean confirmRide() {

        isRideConfirmed = true;
        if (isRideConfirmed) {
            System.out.println("Ride confirmed");
        } else {
            System.out.println("Ride not confirmed.please try again");
        }
        return isRideConfirmed;
    }
}



