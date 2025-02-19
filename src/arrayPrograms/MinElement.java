package arrayPrograms;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter element in array: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min element in array "+min);
    }
}
