package JavaProgram.oops.abstraction;

public class MainClassForDriver {
    public static void main(String[] args) {
        DriverManager.registerDriver(new ChromeDrive());
        DriverManager.registerDriver(new FireFoxDrive());
        DriverManager.registerDriver(new EdgeDriver());


    }
}
