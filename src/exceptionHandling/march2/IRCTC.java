package exceptionHandling.march2;


//A railway system allows only 100 bookings. If a user tries to book after 100 seats are full, handle it.
class OverBookingException extends Exception {
    OverBookingException(String msg) {
        super(msg);
    }
}

public class IRCTC {
    int ticketBooking;
    String destination;

    IRCTC(int ticketBooking,String destination) {
        this.ticketBooking = ticketBooking;
        this.destination=destination;
    }

    void setTicketBooking(int ticket) throws OverBookingException {
        if (ticket > 100) {
            throw new OverBookingException("More than " + 100 + " ticket is not accepted");
        }
        System.out.println(ticket + " are booked for " + destination);

    }



}

class MainClassForTicket {
    public static void main(String[] args) {
        IRCTC book = new IRCTC(1000,"Mumbai");

        try {
            book.setTicketBooking(20);
        } catch (OverBookingException e) {
            System.out.println(e.getMessage());
        }

    }
}
