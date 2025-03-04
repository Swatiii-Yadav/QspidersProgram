package exceptionHandling.march4;

import java.util.ArrayList;
import java.util.List;

public class ManageCarSystem {
        private List<Car> cars = new ArrayList<>();

        public void addCar(Car car) {
            cars.add(car);
        }

        public void showAvailableCars() {
            System.out.println("\nAvailable Cars:");
            for (Car car : cars) {
                if (car.isAvailable()) {
                    System.out.println("- " + car.getModel());
                }
            }
        }

        public Car findCar(String model) {
            for (Car car : cars) {
                if (car.getModel().equalsIgnoreCase(model)) {
                    return car;
                }
            }
            return null;
        }

        public void rentCar(String model, int days) {
            try {
                Car car = findCar(model);
                if (car == null) {
                    System.out.println("Car not found!");
                    return;
                }
                car.rentCar(days);
                System.out.println("Total cost:" + car.calcRentalCost());
            } catch (CarNotAvailableException | InvalidRentalPeriodException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        public void returnCar(String model) {
            Car car = findCar(model);
            if (car != null) {
                car.returnCar();
            } else {
                System.out.println("Car not found in the system.");
            }
        }
    }
