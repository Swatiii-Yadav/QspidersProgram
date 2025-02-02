package numberSystem;

import java.util.Scanner;

public class GreatestCommonDivisor {
    static int divisor(int num1, int num2) {
        int gcd=0;
        for (int i = 1; i <=num1 && i<=num2 ;i++){
            if (num1%i==0 && num2%i ==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Num 1: ");
        int num1 = sc.nextInt();
        System.out.println("Num 2: ");

        int num2 = sc.nextInt();
        System.out.println("Greatest Common Divisor "+divisor(num1,num2));
    }
}
