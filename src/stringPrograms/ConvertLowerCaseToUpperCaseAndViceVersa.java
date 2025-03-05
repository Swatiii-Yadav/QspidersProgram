package stringPrograms;

public class ConvertLowerCaseToUpperCaseAndViceVersa {
    public static void main(String[] args) {
        String str="swaTI yadav ";
        char ch[]=str.toCharArray();
        for (int i=0;i<ch.length;i++){

            if (ch[i]>='A'&&ch[i]<='Z'){
            ch[i]=(char) (ch[i]+32);//unicode value of A is 65 and a is 97 to convert A to a, we need to add 32
            }
            else if(ch[i]>='a'&&ch[i]<='z'){
                ch[i]=(char)(ch[i]-32);//unicode value of A is 65 and a is 97 to convert  a to A, we need to minus 32
            }
        }
        System.out.println(ch);
    }
}
