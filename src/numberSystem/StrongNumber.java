package numberSystem;

import java.util.Scanner;

/*WAP to define a method to check user entered number is strong number is not*/
public class StrongNumber {
    static int  factroialOfNum(int num){
        int rem=0;
        int sum=0;
        while (num>0){
            rem=num%10;
            int fact=1;
            for (int i=1;i<=rem;i++){
                fact*=i;

            }
            sum+=fact;
            num=num/10;
        }
         return sum;
    }
    static boolean checkStrongNum(int num){
        if (factroialOfNum(num)==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(factroialOfNum(num));
        System.out.println(checkStrongNum(num));
    }
}
/*WAP to define a methode to check user inter no is prime no or not*/