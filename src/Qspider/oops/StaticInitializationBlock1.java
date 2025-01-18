package Qspider.oops;

public class StaticInitializationBlock1 {
 static  int x;
 static char y;
 static String z;
 static {
     x=10;
     y='s';
     z="swati";
 }
    public static void main(String[] args) {
        System.out.println("Program started: ");
        System.out.println(StaticInitializationBlock1.x);
        System.out.println(StaticInitializationBlock1.y);
        System.out.println(StaticInitializationBlock1.z);
        System.out.println("Program Ends ");
    }
}
