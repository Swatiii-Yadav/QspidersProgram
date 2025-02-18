package oopsPracticeQuestions.february18;

import java.util.Scanner;

public class MainClassForRemote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("want to turn onn");
        boolean isOn = sc.nextBoolean();
        OperateRemote op = new OperateRemote();
        if (isOn) {
            RemoteManager.turnOnn(op);
        } else {
            System.out.println("turn  off.");
        }


        System.out.println("want to  volume up");
        boolean up = sc.nextBoolean();
        if (up) {
            RemoteManager.volumeUp(op);
        }


        System.out.println("want to  volume down");
        boolean decrease = sc.nextBoolean();
        if (decrease) {
            RemoteManager.volumeDown(op);
        }
    }
}
