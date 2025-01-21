package Qspider.oops;
/*
 Default Constructor:
Write a Java program to create a class called "Cat" with instance variables name and age.
 Implement a default constructor that initializes the name to "Unknown" and the age to 0.
 Print the values of the variables.
 */
public class Cat {
    String name;
    int age;
    Cat(){
        name="Unknown";
        age=0;
    }

    public static void main(String[] args) {
        Cat ref=new Cat();
        System.out.println(ref.name);
        System.out.println(ref.age);
    }
}
