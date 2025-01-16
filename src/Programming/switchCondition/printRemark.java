package Programming.switchCondition;

import java.util.Scanner;

public class printRemark
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter score from A to F");
        char score=sc.next().charAt(0);
        switch (score){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Well Done");
                break;
            case 'C':
                System.out.println("Very Good");
                break;
            case 'D':
                System.out.println("Good");
                break;

            case 'F':
                System.out.println("Fail");
                break;
            default:{
                System.out.println("Invalid input");
            }
        }
    }
}
