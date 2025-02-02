package numberSystem;

import java.util.Scanner;

public class ArmStrongNo {
    static int  getCount(int num){
        int count=0,rem=0,sum=0;
        int temp=num;
        while (temp>0){
            rem=temp%10;
            count++;
            temp=temp/10;
        }
        System.out.println("count "+count);
        return count;
    }
    static int ArmStrong(int num){
       int temp=num;
       int rem=0;
       int sum=0;
       int count=getCount(num);
       while (temp>0){
           rem=temp%10;
           int pow=1;
           for (int i=1;i<=count;i++){
               pow*=rem;
           }
           sum+=pow;
           temp=temp/10;
       }
        System.out.println("Sum of power of digits "+sum);
       return sum;

    }
    static  boolean checkNo(int num){
        return ArmStrong(num) == num;
    }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
        System.out.println(checkNo(num));
    }
}
