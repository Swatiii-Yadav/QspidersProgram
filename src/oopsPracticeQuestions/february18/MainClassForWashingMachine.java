package oopsPracticeQuestions.february18;

import java.util.Scanner;

public class MainClassForWashingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("want to turn onn Washine machine ");
        boolean isOn = sc.nextBoolean();
        WashingMachine machine = new WashingMachine();
        if (isOn) {
            ManageWashinMachine.turnOnn(machine);
        } else {
            System.out.println("turn  off.");
        }
        machine.types();
        System.out.println("want to tdry clothes");
        boolean dry = sc.nextBoolean();
        ManageWashinMachine.dryClothes(machine);
        if (dry) {
            ManageWashinMachine.dryClothes(machine);
        }
      else {
            System.out.println("Not drying...");
        }

    }
}
