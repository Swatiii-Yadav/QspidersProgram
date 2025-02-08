package numberSystem;

import java.util.Scanner;

/*An automorphic number is a natural number whose square ends with the same digits as the number itself.
 For example, 25 and 76 are automorphic numbers because \(25^{2}=625\) and \(76^{2}=5776\)
* */
public class AutoMorphicNumber {
    static void CheckAutoMorph(int num) {
        int pow = (int) Math.pow(num, 2);
        int rem = 0;
        int count = getCount(num);
        rem = pow % (int)Math.pow(10 , count);
        if (rem == num) {
            System.out.println(num + " is Automorphic number");
        } else {
            System.out.println(num + " is Not Automorphic number");
        }

    }

    static int getCount(int num) {
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CheckAutoMorph(num);
    }
}
