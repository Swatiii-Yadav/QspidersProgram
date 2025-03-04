package exceptionHandling.march4;

public class MainClassForSmartHome {
    public class SmartHomeSystem {
        public static void main(String[] args) {
            SmartHome home = new SmartHome();


            home.addDevice(new Light());
            home.addDevice(new Fan());
            home.controlDevice();
        }
    }

}
