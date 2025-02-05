package numberSystem;

import java.util.Scanner;

public class ArmStrongNumberArch2
{
    static boolean checkArmNumber(int num){
        int rem=0,sum=0;
        int c=getCount(num);
        int temp=num;
        while (num>0){
            rem=num%10;
            int pow=(int)Math.pow(rem,c);
            sum+=pow;
            num=num/10;
        }
        return temp == sum;

    }
static int getCount(int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(checkArmNumber(num));
    }
}
