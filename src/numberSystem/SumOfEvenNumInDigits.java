package numberSystem;

import java.util.Scanner;

public class SumOfEvenNumInDigits {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while (num>0){
            int rem=num%10;
            if (rem%2==0){
                sum+=rem;
            }
            num=num/10;
        }
        System.out.println(sum);
    }
}
