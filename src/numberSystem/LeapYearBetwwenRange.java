package numberSystem;

import java.util.Scanner;
/** find all  leap year present between 2000-5000 */
public class LeapYearBetwwenRange {
    public static void main(String[] args) {
     for (int i=2000;i<=5000;i++){
         if ((i%4==0 && i%100!=0)||i%400==0){
             System.out.println(i+ " is leap year");
         }
     }
    }
}
