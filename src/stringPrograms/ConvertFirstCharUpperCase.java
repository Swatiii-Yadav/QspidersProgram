package stringPrograms;

public class ConvertFirstCharUpperCase {
    public static void main(String[] args) {
        String str="swaTI yadav ";
        char ch[]=str.toCharArray();
        for (int i=0;i<ch.length;i++){

            if (ch[i]>='a'&&ch[i]<='z' && i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' '){
                ch[i]=(char) (ch[i]-32);
            }
            else if (ch[i] >= 'A' && ch[i] <= 'Z' && !(i == 0 || ch[i - 1] == ' ')) {
                ch[i]=(char)(ch[i]+32);
            }
        }
        System.out.println(ch);
    }
}
