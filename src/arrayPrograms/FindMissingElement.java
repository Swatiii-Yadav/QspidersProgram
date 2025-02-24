package arrayPrograms;

import java.util.Scanner;

public class FindMissingElement {
    public static void main(String[] args) {

        int[] arr = {10, 7, 1, 2};
        int max=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        for (int i = 1; i <max; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(i + " ");
            }
        }
    }
}
