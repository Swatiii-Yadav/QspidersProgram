package numberSystem;

import java.util.Scanner;

public class DuckNo {
    public static boolean checkDuckNo(int num){
        if (num == 0) {
            return false;
        }

        while (num != 0) {
            int digit = num % 10;
            if (digit == 0) {
                return true;}
            num /= 10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number : ");
        int num=sc.nextInt();
        if (num < 0) {
            System.out.println("enter a positive number.");
            return;
        }

        boolean result = checkDuckNo(num);
        if (result) {
            System.out.println(num + " is a Duck Number.");
        } else {
            System.out.println(num + " is not a Duck Number.");
        }
    }
}
