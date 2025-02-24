package arrayPrograms;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] a = {10, 20, 20, 10, 30, -1};
        boolean[] visited = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(a[i] + " occurs " + count + " times.");
        }
    }
}
