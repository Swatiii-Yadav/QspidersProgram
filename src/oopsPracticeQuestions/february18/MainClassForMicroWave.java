package oopsPracticeQuestions.february18;

import java.util.Scanner;

public class MainClassForMicroWave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("want to turn onn microwave ");
        boolean isOn = sc.nextBoolean();
        Microwave manage = new Microwave();
        if (isOn) {
            ManageMicroWave.turnOnn(manage);
        } else {
            System.out.println("turn  off.");
        }

        ManageMicroWave.Timer(manage);
        ManageMicroWave.temp(manage);

    }

}
