package Qspider.oops;

public class NonStaticIniBlock2 {
char c;
    {
        c='s';
    }
    {
        c='y';
    }
    {
        c='H';
    }
    public static void main(String[] args) {
        NonStaticIniBlock2 ref=new NonStaticIniBlock2();
        System.out.println(ref.c);
    }
}
