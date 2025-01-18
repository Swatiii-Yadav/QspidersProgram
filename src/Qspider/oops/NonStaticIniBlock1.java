package Qspider.oops;

public class NonStaticIniBlock1 {
    int x;
    double y;
    boolean z;
    {
        x=25;
    }
    {
        y=2.5;
    }
    {
        z=false;
    }
    public static void main(String[] args) {
        NonStaticIniBlock1 ref=new NonStaticIniBlock1();
        System.out.println(ref.x);
        System.out.println(ref.y);
        System.out.println(ref.z);

    }
}
