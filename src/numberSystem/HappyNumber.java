package numberSystem;

import java.util.Scanner;

public class HappyNumber {
    static boolean isHappy(int num) {
int rem=0;
        while (num >=10) {
            int sum = 0;
            while (num > 0) {
                rem=num%10;
                int pow=1;
                sum += (int) Math.pow(rem,2);
                num = num / 10;
            }
            System.out.println(sum);
            num=sum;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int num = sc.nextInt();
        if (isHappy(num)) {
            System.out.println(num + " is Happy number");
        } else {
            System.out.println(num + " is   Not a Happy number");

        }
    }

}
