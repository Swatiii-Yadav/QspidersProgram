package numberSystem;

import java.util.Scanner;

public class BinaryValueIntoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int dec=0,base=1;
        while (num>0){
            int rem=num%10;
            dec=dec+(rem*base);
            base*=2;
            num=num/10;
        }
        System.out.println(dec);
    }
}
