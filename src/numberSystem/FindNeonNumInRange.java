package numberSystem;

import java.util.Scanner;

public class FindNeonNumInRange {
    public static void main(String[] args) {
        System.out.println("Enter Positive range between you want to find neon number");
        Scanner sc = new Scanner(System.in);
        int sqr = 0;

        int range = sc.nextInt();
        if (range<0){
            System.out.println("Enter valid range");
        }
       for (int i=1;i<range;i++) {
           sqr = i * i;
           int sum=0;
           while (sqr > 0) {
               int rem = sqr % 10;

               sum += rem;
               sqr = sqr / 10;

           }
           if (sum == i) {
               System.out.println(i + " is a neon number");
           }
       }
    }
}
