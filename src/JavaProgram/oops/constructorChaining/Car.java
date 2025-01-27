package JavaProgram.oops.constructorChaining;

import JavaProgram.Main;

public class Car {
    public Car(int a) {
        System.out.println("Basic variant");
    }

    public Car(double d) {
        this(45);
        System.out.println("Mid variant");
    }

    public Car(String s) {
        this(5.7);
        System.out.println("Top variant");
    }

    public static void main(String[] args) {
        Car c1 = new Car("xyz");
    }
}
