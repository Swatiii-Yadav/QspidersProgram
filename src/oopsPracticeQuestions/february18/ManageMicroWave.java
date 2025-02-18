package oopsPracticeQuestions.february18;

public class ManageMicroWave {
    static void turnOnn(FunctionalityOfMicroWave micro) {
        if (micro!= null) {
            if (micro.turnOnn()) {
                System.out.println("turn onn");

            } else {
                System.out.println(" failed to turn onn");
            }
        }

    }
    static void turnOff(FunctionalityOfMicroWave micro) {
        if (micro!= null) {
            if (micro.turnOff()) {
                System.out.println("turn off");

            } else {
                System.out.println("failed to turn off");
            }
        }

    }

    static void Timer(FunctionalityOfMicroWave micro) {
        if (micro != null) {
            micro.timer();

        }
    }

    static void temp(FunctionalityOfMicroWave micro) {
        if (micro != null) {
            micro.temprature();

        }
    }

}
