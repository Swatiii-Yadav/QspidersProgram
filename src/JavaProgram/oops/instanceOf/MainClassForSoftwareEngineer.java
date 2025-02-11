package JavaProgram.oops.instanceOf;

public class MainClassForSoftwareEngineer {
    public static void main(String[] args) {
        Tester qa=new Tester();
        Manager.assignWork(qa);

        Developer dev=new Developer();
        Manager.assignWork(dev);

    }
}
