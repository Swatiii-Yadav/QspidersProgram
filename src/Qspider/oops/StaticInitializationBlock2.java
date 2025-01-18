package Qspider.oops;

public class StaticInitializationBlock2 {
    static int x;
    static double y;
    static boolean z;

    static {
        x = 67;
    }

    static {
        y = 56.7;
    }

    static {
        z = true;
    }

    public static void main(String[] args) {
        System.out.println("Program started: ");
        System.out.println(StaticInitializationBlock1.x);
        System.out.println(StaticInitializationBlock1.y);
        System.out.println(StaticInitializationBlock1.z);
        System.out.println("Program Ends ");
    }

}
