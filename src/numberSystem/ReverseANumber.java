package numberSystem;

import java.util.Scanner;

/*WAp to reverse a  user defined number*/
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem=0,temp=num,rev=0;
        while (num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
