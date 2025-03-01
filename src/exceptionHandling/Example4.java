package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        try{
            int val=sc.nextInt();
            System.out.println("Value "+val);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input provided");
        }
        finally {
            sc.close();
            System.out.println("Scnner close");
        }
    }
}
