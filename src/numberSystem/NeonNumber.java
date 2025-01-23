package numberSystem;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int sqr = 0, sum = 0;
        int num = sc.nextInt();
        sqr = num * num;

            while (sqr > 0) {
                int rem = sqr % 10;
                sum += rem;
                sqr = sqr / 10;

            }

      if (sum==num){
          System.out.println(num+" is a neon number");
      }
      else {
          System.out.println(num+" is not a neon number");
      }
    }
}
