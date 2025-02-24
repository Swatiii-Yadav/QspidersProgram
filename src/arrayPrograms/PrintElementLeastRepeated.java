package arrayPrograms;

public class PrintElementLeastRepeated {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1, 1, 4, 4};

        int minCount = 0;
        int minFrequent = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count < minCount) {
                minCount = count;
                minFrequent = arr[i];
            }
        }

        System.out.println("Element repeated the most times: " + minFrequent);
    }
}
