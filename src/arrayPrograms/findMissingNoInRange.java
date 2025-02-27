package arrayPrograms;

import java.util.Map;

public class findMissingNoInRange {
    static boolean isMissing(int[] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 18, 4};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }


        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        for (int i = min+1; i <=max-1; i++) {
            if (isMissing(arr, i)) {
                System.out.println(i);
            }
        }
    }
}
