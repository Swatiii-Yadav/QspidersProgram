package oopsPracticeQuestions.february17;

public class DeviceManager {
    static   void SwitchOnn(SmartDevices sd){
        if (sd!=null){
            if (sd instanceof SmartLight){
                SmartLight light=(SmartLight) sd;
                light.turnOn();
            }
            if (sd instanceof SmartThermostat){
                SmartThermostat thermostat=(SmartThermostat) sd;
                thermostat.turnOn();
            }
            if (sd instanceof SmartSecurityCamera){
                SmartSecurityCamera camera=(SmartSecurityCamera) sd;
                camera.turnOn();
            }
            else {
                sd.turnOn();
            }
        }
    }


    static  void SwitchOff(SmartDevices sd){
        if (sd!=null){
            if (sd instanceof SmartLight){
                SmartLight light=(SmartLight) sd;
                light.turnOff();
            }
            if (sd instanceof SmartThermostat){
                SmartThermostat thermostat=(SmartThermostat) sd;
                thermostat.turnOff();
            }
            if (sd instanceof SmartSecurityCamera){
                SmartSecurityCamera camera=(SmartSecurityCamera) sd;
                camera.turnOff();
            }
            else {
                sd.turnOff();
            }
        }
    }

    static  void Control(SmartDevices sd){
        if (sd!=null){
            if (sd instanceof SmartLight){
                SmartLight light=(SmartLight) sd;
                light.control();
            }
            if (sd instanceof SmartThermostat){
                SmartThermostat thermostat=(SmartThermostat) sd;
                thermostat.control();
            }
            if (sd instanceof SmartSecurityCamera){
                SmartSecurityCamera camera=(SmartSecurityCamera) sd;
                camera.control();
            }
            else {
                sd.control();
            }
        }
    }

    static  void Status(SmartDevices sd){
        if (sd!=null){
            if (sd instanceof SmartLight){
                SmartLight light=(SmartLight) sd;
                light.status();
            }
            if (sd instanceof SmartThermostat){
                SmartThermostat thermostat=(SmartThermostat) sd;
                thermostat.status();
            }
            if (sd instanceof SmartSecurityCamera){
                SmartSecurityCamera camera=(SmartSecurityCamera) sd;
                camera.status();
            }
            else {
                sd.status();
            }
        }
    }
}
