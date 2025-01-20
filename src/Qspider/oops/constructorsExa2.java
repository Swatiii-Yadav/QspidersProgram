package Qspider.oops;

public class constructorsExa2 {
    int value;
    void test(){

    }
     constructorsExa2(int a, int b){
        int c=a+b;
         System.out.println("c:"+c);
    }
    public static void main(String[] args) {
        constructorsExa2 ex=new constructorsExa2(4,7);
        ex.value=10;
        System.out.println("value: "+ex.value);

    }
}
