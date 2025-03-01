package exceptionHandling;

public class Example
{
    public static void main(String[] args) {
        System.out.println("program start");
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("/ by 0");
        }
        System.out.println("Program end");
    }
}
