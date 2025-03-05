package stringPrograms;

public class CountCharInEachWords {
    public static void main(String[] args) {
        String str = "swaTI yadav is GooD";
        char ch[] = str.toCharArray();
        int n = ch.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] != ' ') {
                count++;
            }
            if ((i < n - 1 && ch[i + 1] == ' ') || i == n - 1) {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char) (ch[i] - 32);
                }
                System.out.print(ch[i] + "" + count + " ");
                count = 0;
            }
            else if (ch[i] >= 'A' && ch[i] <= 'Z' && (i < n - 1 && ch[i + 1] != ' ')) {
                ch[i] = (char) (ch[i] + 32);
                System.out.print(ch[i]);
            }
            else if (ch[i] == ' ') {
                System.out.print(" ");
            }
        }
    }
}
