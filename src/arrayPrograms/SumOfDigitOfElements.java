package arrayPrograms;

import java.util.Scanner;

public class SumOfDigitOfElements {
   static int findSum(int num){
       int sum=0;
        while (num>0){

            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
return sum;
    }

    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
           int sum= findSum(arr[i]);
            System.out.print(+sum+" ");
        }

    }
}
