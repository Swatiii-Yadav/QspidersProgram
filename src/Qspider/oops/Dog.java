package Qspider.oops;
/*Parameterized Constructor:
Write a Java program to create a class called Dog with instance variables name and color.
 Implement a parameterized constructor that takes name and color as parameters and initializes
 the instance variables. Print the values of the variables.*/

public class Dog {
    String name;
    String color;

    Dog(String n, String c) {
        name = n;
        color = c;
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Tommy", "black");
        System.out.println("Details of First dog");
        System.out.println(dog1.name);
        System.out.println(dog1.color);

        Dog dog2 = new Dog("Jimmy", "golden");
        System.out.println("Details of First dog");
        System.out.println(dog2.name);
        System.out.println(dog2.color);
    }
}