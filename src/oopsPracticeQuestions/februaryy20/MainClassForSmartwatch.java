package oopsPracticeQuestions.februaryy20;

import oopsPracticeQuestions.february20.ManageSmartwatch;

import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

public class MainClassForSmartwatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Date date = new Date();
        LocalTime time = LocalTime.now();
        int step;
        boolean play=false;
        Stack<String> msg = new Stack<>();

        DisplayWatch myWatch = new DisplayWatch(time,date,1000,play,msg);
        myWatch.addNotification("classes at 4PM ");
        myWatch.addNotification("classes at 6PM ");
        myWatch.addNotification("classes at 10AM ");
        myWatch.addNotification("classes at 12PM ");

      ManageSmartwatch.display1(myWatch);
       ManageSmartwatch.display2(myWatch);
        ManageSmartwatch.display3(myWatch);
        ManageSmartwatch.display4(myWatch);

    }
}
