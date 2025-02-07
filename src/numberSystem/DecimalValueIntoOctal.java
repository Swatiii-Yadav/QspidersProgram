package numberSystem;

import java.util.Scanner;

public class DecimalValueIntoOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        String octal="";
        while (num>0){
            int rem=num%8;
            octal=rem+octal;
            num=num/8;
        }
        System.out.println(octal);
    }
}
