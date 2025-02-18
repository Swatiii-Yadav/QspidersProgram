package oopsPracticeQuestions.february18;

interface FunctionalityOfWashingMachine {
    String[] types = {"Daily ", "Baby Care", "Woolen", "Delicate", "Pants"};


    boolean turnOnn();

    boolean turnOff();

    boolean dry();

}

public class WashingMachine implements FunctionalityOfWashingMachine {
    boolean isOn = false;
    double time;

    @Override
    public boolean turnOnn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Machine is switch onn");
            return true;
        }
        return false;
    }

    @Override
    public boolean turnOff() {
        if (isOn) {
            isOn = true;
            System.out.println("Machine is switch off");
            return true;
        }
        return false;
    }

    boolean dryCloth = false;

    @Override
    public boolean dry() {
        if (!isOn) {
            isOn = true;
            System.out.println("Drying cloth");
            return true;

        }
        return false;
    }
     void types(){
         System.out.println("Select type:");
         for (String type:FunctionalityOfWashingMachine.types ) {
             System.out.println(" "+type);
         }
     }


}
