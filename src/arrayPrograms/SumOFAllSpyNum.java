package arrayPrograms;

import java.util.Scanner;

public class SumOFAllSpyNum {
    static boolean isSpy(int num) {
        int sum = 0, prod = 1;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
            prod *= rem;
            temp = temp / 10;
        }
       if (sum==prod){
           return true;
       }
       return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (isSpy(arr[i])){
                sum+=arr[i];
            }
        }
        System.out.println("sum of all spy number present in arr : "+sum);
    }
}
