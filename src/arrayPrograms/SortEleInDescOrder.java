package arrayPrograms;

import java.util.Scanner;

public class SortEleInDescOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter element into an array");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before sorting");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=0;i<size;i++) {
            for (int j = 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorting");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
