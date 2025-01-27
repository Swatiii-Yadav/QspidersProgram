package JavaProgram.oops.constructorChaining;

public class Hotel {

    public Hotel(int i) {

        System.out.println("Domino's");
    }
    public Hotel(double d) {
        this(45);
        System.out.println("KFC");
    }
    public Hotel(String  s) {
        this(54.8);
        System.out.println("McDonalds");
    }

    public static void main(String[] args) {
        Hotel h1=new Hotel("Hotel");
    }
}
