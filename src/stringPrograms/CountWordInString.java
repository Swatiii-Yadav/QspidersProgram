package stringPrograms;


//WAP TO COUNT HOW MANY WORDS ARE PRESENT IN THE GIVEN STRING
//
public class CountWordInString {
    public static void main(String[] args) {
        String str="   Ram       is      good.";
        int count=0;
       char ch[]=str.toCharArray();

      for (int i=0;i<str.length();i++){
        if (i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' '){
            count++;
        }
      }
        System.out.println(count);
    }
}
//wap to convert uppercase char into lower case