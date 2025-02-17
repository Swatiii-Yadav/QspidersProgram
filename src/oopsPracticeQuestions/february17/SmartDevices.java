package oopsPracticeQuestions.february17;

//* Smart Home Automation
//Create a smart home system with a base class SmartDevice.
// Derived classes include SmartLight, SmartThermostat, and SmartSecurityCamera.
// Use polymorphism to control devices differently

// super interface
public interface SmartDevices {
    void turnOn();

    void turnOff();

    void status();

    void control();
}


//subclass
class SmartLight implements SmartDevices {
    boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("the light is on ");

    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("the light is off  ");
    }

    @Override
    public void status() {
        if (isOn) {
            System.out.println("Light is turn on now");
        } else {
            System.out.println("Light is turn off now");

        }
    }

    @Override
    public void control() {
        System.out.println("control the light color and flow");
    }
}


//subclass
class SmartThermostat implements SmartDevices {
    boolean isOn;
    double temp;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Thermostat is switch onn now");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Thermostat is switch off now");
    }

    @Override
    public void status() {
        if (isOn) {
            System.out.println("Thermostat is switch on now");
        } else {
            System.out.println("Thermostat is switch off now");

        }
    }

    @Override
    public void control() {
        temp = 22.7;
        System.out.println(" temp of thermostat is  " + temp + " celcius");
    }
}


//subclass
class SmartSecurityCamera implements SmartDevices {
    boolean isOn;
    boolean recording;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Camera is switch on ");

    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Camera is switch on ");

    }

    @Override
    public void status() {
        recording = true;
        if (isOn) {
            System.out.println("camera is onn");
            if (recording) {
                System.out.println("camera is recording");
            } else {
                System.out.println("Camera is not recording");
            }

        } else {
            System.out.println("Camera is off");
        }
    }

    @Override
    public void control() {
        recording = true;
        System.out.println("Camera is recording");
    }
}
