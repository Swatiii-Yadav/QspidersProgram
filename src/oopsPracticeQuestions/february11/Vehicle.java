package oopsPracticeQuestions.february11;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping...");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    void stop() {
        System.out.println("Bike is stopping...");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    void stop() {
        System.out.println("Truck is stopping...");
    }


}

class MainClassforVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();
        System.out.println("------------------------");
        car.start();
        System.out.println("------------------------");
        car.stop();
        System.out.println("------------------------");
        bike.start();
        System.out.println("------------------------");
        bike.stop();
        System.out.println("------------------------");
        truck.start();
        System.out.println("------------------------");
        truck.stop();

        System.out.println("------------------------");
    }
}