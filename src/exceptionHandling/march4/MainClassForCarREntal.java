package exceptionHandling.march4;

import java.util.Scanner;

public class MainClassForCarREntal {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            ManageCarSystem rentalSystem = new ManageCarSystem();

            
            rentalSystem.addCar(new Wagonar("xyz"));
            rentalSystem.addCar(new SUV("SUV"));
            

            while (true) {
                System.out.println("\n--- Car Rental System ---");
                System.out.println("1. View Available Cars");
                System.out.println("2. Rent a Car");
                System.out.println("3. Return a Car");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                if (choice == 4) break;

                switch (choice) {
                    case 1:
                        rentalSystem.showAvailableCars();
                        break;
                    case 2:
                        System.out.print("Enter car model: ");
                        String rentModel = sc.nextLine();
                        System.out.print("Enter rental days: ");
                        int days = sc.nextInt();
                        rentalSystem.rentCar(rentModel, days);
                        break;
                    case 3:
                        System.out.print("Enter car model to return: ");
                        String returnModel = sc.nextLine();
                        rentalSystem.returnCar(returnModel);
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
           
        }
    }
