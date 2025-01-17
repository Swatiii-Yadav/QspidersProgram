package Programming.switchCondition;

import java.util.Scanner;

public class EvenOddUsingSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        switch (num%2){
            case 0:
                System.out.println("Even number");
                break;
            default:
                System.out.println("Odd number");
        }
    }
}
