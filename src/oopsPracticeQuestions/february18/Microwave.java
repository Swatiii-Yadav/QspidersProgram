package oopsPracticeQuestions.february18;

import java.util.Scanner;

interface FunctionalityOfMicroWave {
    boolean turnOnn();

    boolean turnOff();

    void timer();

    void temprature();

}

public class Microwave implements FunctionalityOfMicroWave {
    boolean isOn = false;
    double temp=0.0;
    double timer=1;

    @Override
    public boolean turnOnn() {
        if (!isOn){
            isOn=true;
            return  true;
        }
        return false;
    }

    @Override
    public boolean turnOff() {
        if (isOn){
            isOn=true;
            return  true;
        }
        return false;
    }

    @Override
    public void timer() {
        System.out.println("Set timer : ");
        Scanner sc=new Scanner(System.in);
        double setTimer=sc.nextDouble();
        System.out.println("Timer set for "+setTimer+" min");
    }

    @Override
    public void temprature() {
        System.out.println("Set temprature : ");
        Scanner sc=new Scanner(System.in);
        double setTemp=sc.nextDouble();
        System.out.println("temprature  set at "+setTemp);
    }
}
