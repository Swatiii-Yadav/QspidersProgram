package Qspider.oops;

public class StaticInitializationBlock {
    static  int a;
    static {
        a=10;
    }
    public static void main(String[] args) {
        System.out.println("Program started ");
        System.out.println(StaticInitializationBlock.a);
        System.out.println("Program end ");
    }
}
