package Qspider.oops;

public class NonStaticIniBlock {
    int x;
    double d;
    char c;
    {
        x=50;
        d=3.4;
        c='H';
    }
    public static void main(String[] args) {
        NonStaticIniBlock ref=new NonStaticIniBlock();
        System.out.println(ref.x);
        System.out.println(ref.d);
        System.out.println(ref.c);
    }
}
