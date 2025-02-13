package JavaProgram.oops.abstraction;

public interface Driver
{
    void register();
}
class ChromeDrive implements Driver{

    @Override
    public void register() {
        System.out.println("Chrome driver");
    }
}
class FireFoxDrive implements Driver{

    @Override
    public void register() {
        System.out.println("FireFox  driver");

    }
}
class EdgeDriver implements  Driver{

    @Override
    public void register() {
        System.out.println("Edge driver");

    }
}