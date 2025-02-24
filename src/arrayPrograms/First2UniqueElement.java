package arrayPrograms;

public class First2UniqueElement {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 30, 40, 50};
        int uniqueCount = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(a[i] + " ");
                uniqueCount++;
                if (uniqueCount == 2) {
                    break;
                }
            }
        }
    }
}