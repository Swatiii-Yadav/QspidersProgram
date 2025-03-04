package exceptionHandling.march4;

class InvalidSettingException extends Exception {
    public InvalidSettingException(String message) {
        super(message);
    }
}

public  interface SmartDevice {
    void turnOn();
    void turnOff();
    void setSetting(int value) throws InvalidSettingException;
}


  class Light implements SmartDevice {
    private boolean isOn;
    private int brightness;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light is turn ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light is turn OFF.");
    }

    @Override
    public void setSetting(int val) throws InvalidSettingException {
        if (val < 0 || val > 10) {
            throw new InvalidSettingException("Brightness must be between 0 and 10.");
        }
        brightness = val;
        System.out.println("Light brightness set to: " + brightness);
    }
}


class Fan implements SmartDevice {
    private boolean isOn;
    private int speed;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Fan is turn ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Fan is turn OFF.");
    }

    @Override
    public void setSetting(int value) throws InvalidSettingException {
        if (value < 1 || value > 5) {
            throw new InvalidSettingException("Fan speed must be between 1 and 5.");
        }
        speed = value;
        System.out.println("Fan speed set to: " + speed);
    }
}
