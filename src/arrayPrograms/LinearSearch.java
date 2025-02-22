package arrayPrograms;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter element into an array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Target");
        int target = sc.nextInt();
        System.out.println(target+" found?? "+linearSearch(arr, target));
    }
}
