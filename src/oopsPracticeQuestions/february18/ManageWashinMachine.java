package oopsPracticeQuestions.february18;

public class ManageWashinMachine {
    static void turnOnn(FunctionalityOfWashingMachine machine) {
        if (machine!= null) {
            if (machine.turnOnn()) {
                System.out.println("turn onn");

            } else {
                System.out.println(" failed to turn onn");
            }
        }

    }
    static void turnOff(FunctionalityOfWashingMachine machine) {
        if (machine!= null) {
            if (machine.turnOff()) {
                System.out.println("turn off");

            } else {
                System.out.println("failed to turn off");
            }
        }

    }
    static void dryClothes(FunctionalityOfWashingMachine machine) {
        if (machine != null) {
            System.out.println("drying...");
            machine.dry();

        }
    }


}
