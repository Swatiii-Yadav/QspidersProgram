package stringPrograms;

public class ConvertLastCharUpperCase {
    public static void main(String[] args) {
        String str="swaTI yadav ";
        char ch[]=str.toCharArray();
        int n=ch.length;
        for (int i = 0; i < n; i++) {

            if ((i < n - 1 && ch[i + 1] == ' ' || i == n - 1) && (ch[i] >= 'a' && ch[i] <= 'z')) {
                ch[i] = (char) (ch[i] - 32); // Convert to uppercase
            }

            else if (ch[i] >= 'A' && ch[i] <= 'Z' && (i == 0 || ch[i - 1] != ' ') && (i < n - 1 && ch[i + 1] != ' ')) {
                ch[i] = (char) (ch[i] + 32); // Convert to lowercase
            }
        }
        System.out.println(String.valueOf(ch));
    }
}
