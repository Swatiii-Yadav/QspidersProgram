package oopsPracticeQuestions.february17;

public class MainClassForRoom {
    public static void main(String[] args) {
        HotelBooking.getRate(new StandardRoom("Stanfard ",1999));
        HotelBooking.getRate(new DeluxeRoom("DEluxe ",6999));

    }
}
