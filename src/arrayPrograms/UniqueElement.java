package arrayPrograms;

public class UniqueElement {
    public static void main(String[] args) {
        int[] a = {10, 20,20,10, 30, -1};
        int count = 0;
        boolean b[] = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == false) {
                count = 1;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    b[j] = true;
                }
            }

            if (count == 1) {
                System.out.print(a[i]+" ");
            }
        }

    }
}
