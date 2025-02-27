package arrayPrograms;

import java.util.Arrays;

    public class RemoveDuplicate{
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 2, 4, 3, 5};
            int[] uniqueArray = removeDuplicates(array);


            for (int i = 0; i < uniqueArray.length; i++) {
                System.out.print(uniqueArray[i] + " ");
            }
        }

        public static int[] removeDuplicates(int[] arr) {
            int n = arr.length;
            int[] temp = new int[n];
            int newSize = 0;

            for (int i = 0; i < n; i++) {
                boolean found = false;
                for (int j = 0; j < newSize; j++) {
                    if (arr[i] == temp[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    temp[newSize] = arr[i];
                    newSize++;
                }
            }


            int[] result = new int[newSize];
            for (int i = 0; i < newSize; i++) {
                result[i] = temp[i];
            }

            return result;
        }
    }


