package numberSystem;

import java.util.Scanner;

public class DeseruiumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkNo(num));
    }

    static int getCount(int num) {
        int count = 0, rem = 0, sum = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        return count;
    }

    static int CheckDiseriumNum(int num) {
        int temp = num;
        int rem = 0;
        int sum = 0;
        int count = getCount(num);
        while (num > 0) {
            rem = num % 10;
            int pow = (int) Math.pow(rem, count);
            sum += pow;
            num = num / 10;
            count--;
        }
        System.out.println(sum);
        return sum;

    }

    static boolean checkNo(int num) {
        return CheckDiseriumNum(num) == num;
    }
}
