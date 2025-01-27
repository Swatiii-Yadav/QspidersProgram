package JavaProgram.oops.constructorChaining;

import java.util.Scanner;

public class City {
    public City(int a) {
        System.out.println("Bhopal");
    }

    public City(int a, double b) {
        this(45);
        System.out.println("Ahmedabad");

    }

    public City(int a, double b, boolean c) {
        this(4, 7.9);
        System.out.println("Noida");
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        double y=sc.nextDouble();
        boolean z=sc.nextBoolean();
        City c1 = new City(x, y, z);
    }
}
