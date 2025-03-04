package exceptionHandling.march4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


 public  class SmartHome {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void controlDevice() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Smart Home Control Panel ---");
            System.out.println("1. Turn ON a device");
            System.out.println("2. Turn OFF a device");
            System.out.println("3. Adjust device settings");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            if (choice == 4) break;

            System.out.println("Select Device: 1. Light  2. Fan  3. AC");
            int deviceChoice = scanner.nextInt();
            SmartDevice device = null;

            if (deviceChoice >= 1 && deviceChoice <= 3) {
                device = devices.get(deviceChoice - 1);
            } else {
                System.out.println("Invalid device choice!");
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        device.turnOn();
                        break;
                    case 2:
                        device.turnOff();
                        break;
                    case 3:
                        System.out.print("Enter setting value: ");
                        int setting = scanner.nextInt();
                        device.setSetting(setting);
                        break;
                    default:
                        System.out.println("Invalid option! Try again.");
                }
            } catch (InvalidSettingException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}


