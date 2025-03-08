package oopsPracticeQuestions.march1TO8;

public class RideServiceImpl {
    public void processRide(RideService ride, String source, String destination, double distance) {
        try {
            ride.calculateFare(distance);
            boolean booked = ride.bookRide(source, destination);
            if (booked) {
                ride.confirmRide();
            }
        } catch (RideException e) {
            System.out.println("Error in ride process: " + e.getMessage());
        }
    }
}
