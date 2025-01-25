package numberSystem;

import java.util.Scanner;
/** check if the number is divisible by 5 or not*/

public class SumOfDigitsDivisibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,rem;
        while (num > 0) {
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        if (sum%5==0){

        }
    }
}
