package oopsPracticeQuestions.february17;

public class MainClassForSmartDevice {
    public static void main(String[] args) {
        System.out.println("Switching on th devices...........");
        System.out.println("------------------------------------");
        DeviceManager.SwitchOnn(new SmartLight());
        DeviceManager.SwitchOnn(new SmartThermostat());
        DeviceManager.SwitchOnn(new SmartSecurityCamera());
        System.out.println("------------------------------------");



        System.out.println("Switching off the devices...........");
        DeviceManager.SwitchOff(new SmartLight());
        DeviceManager.SwitchOff(new SmartThermostat());
        DeviceManager.SwitchOff(new SmartSecurityCamera());
        System.out.println("------------------------------------");



        System.out.println("Control  devices........");
        DeviceManager.Control(new SmartLight());
        DeviceManager.Control(new SmartThermostat());
        DeviceManager.Control(new SmartSecurityCamera());
        System.out.println("------------------------------------");


        System.out.println("Status of  devices...........");
        DeviceManager.Status(new SmartLight());
        DeviceManager.Status(new SmartThermostat());
        DeviceManager.Status(new SmartSecurityCamera());
        System.out.println("------------------------------------");




    }
}
