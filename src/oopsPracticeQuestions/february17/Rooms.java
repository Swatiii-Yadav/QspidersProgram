package oopsPracticeQuestions.february17;

// Hotel Booking System
//Create a hotel booking system with room categories (StandardRoom, DeluxeRoom, SuiteRoom)
// inheriting from a base Room class. Use polymorphism for calculating room rates and amenities.
/*Room Class: The base class with common properties and methods for all room types.
StandardRoom, DeluxeRoom, SuiteRoom: Subclasses that implement specific behavior for each type of room.
Polymorphism: We use polymorphism to calculate room rates and amenities based on the type of room booked.
Methods: Methods to calculate rates, list amenities, and display room details.
* */
abstract class Rooms {
    String room;
    double baseRate;
    Rooms(String room,double baseRate){
        this.room=room;
        this.baseRate=baseRate;
    }

    double   calcRate(int day) {
return baseRate*day;
    }

    void displayDetails() {
        System.out.println("Room Type: " + room);
        System.out.println("Base Rate per day" + baseRate);
    }
}
class StandardRoom extends Rooms{
    StandardRoom(String room, double baseRate) {
        super("Standard", 1000);
    }
    @Override
    double calcRate(int noOfDays){
        return  baseRate*noOfDays;
    }
}

class DeluxeRoom extends Rooms{
    DeluxeRoom(String room, double baseRate) {
        super("Standard", 5000);
    }
    @Override
    double calcRate(int noOfDays){
        return  baseRate*noOfDays;
    }

}

