package numberSystem;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem=0,temp=num,rev=0;
        while (temp>0){
            rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }
        System.out.println("Original Number "+num);
        System.out.println("Reverse Number "+rev);
        if (num==rev){
            System.out.println(num+" is a palindrome number");
        }
        else {
            System.out.println(num+" is  Not a palindrome number");
        }

    }
}
