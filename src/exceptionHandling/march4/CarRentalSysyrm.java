package exceptionHandling.march4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    class CarNotAvailableException extends Exception {
        public CarNotAvailableException(String message) {
            super(message);
        }
    }
    class InvalidRentalPeriodException extends Exception {
        public InvalidRentalPeriodException(String message) {
            super(message);
        }
    }
    interface Rent {
        void rentCar(int days) throws CarNotAvailableException, InvalidRentalPeriodException;
        void returnCar();
        double calcRentalCost();
    }

    abstract class Car implements Rent {
         String model;
         double dailyRate;
         boolean isRented;
         int rentalDays;

        public Car(String model, double dailyRate) {
            this.model = model;
            this.dailyRate = dailyRate;
            this.isRented = false;
        }

        @Override
        public void rentCar(int days) throws CarNotAvailableException, InvalidRentalPeriodException {
            if (isRented) {
                throw new CarNotAvailableException("rar is already rented" + model);
            }
            if (days <= 0) {
                throw new InvalidRentalPeriodException("rental period must be at least 1 day.");
            }
            this.rentalDays = days;
            isRented = true;
            System.out.println(model + "rented for" + days + "days.");
        }

        @Override
        public void returnCar() {
            if (isRented) {
                isRented = false;
                System.out.println(model + " has been returned.");
            } else {
                System.out.println(model + " was not rented.");
            }
        }

        @Override
        public double calcRentalCost() {
            return dailyRate * rentalDays;
        }

        public String getModel() {
            return model;
        }

        public boolean isAvailable() {
            return !isRented;
        }
    }


    class Wagonar extends Car {
        public Wagonar(String model) {
            super(model, 50); // $50 per day
        }
    }

    class SUV extends Car {
        public SUV(String model) {
            super(model, 80); // $80 per day
        }
    }


