package oopsPracticeQuestions.february14;

import java.util.Scanner;

public class MainClassForDelivery {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter delivery type (Bike or Drone) in lower cas: ");
                String deliveryType = scanner.nextLine();

                Delivery delivery;

                switch (deliveryType) {
                    case "bike" :
                        delivery = new BikeDelivery();
                        break;
                    case "drone":
                        delivery = new DroneDelivery();
                        break;
                    default:
                        System.out.println("Invalid ");
                        return;
                }

                delivery.getDeliveryDetails();
                delivery.trackDelivery();

            }
        }
