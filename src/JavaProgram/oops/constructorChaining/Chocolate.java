package JavaProgram.oops.constructorChaining;

public class Chocolate {
    public Chocolate(int a) {
        this(5.8);
        System.out.println("Silk");
    }
    public Chocolate(double d) {
        this(true);
        System.out.println("Kit kat");
    }
    public Chocolate(boolean b) {
        System.out.println("Much");
    }

    public static void main(String[] args) {
        Chocolate c1=new Chocolate(67);

    }
}
