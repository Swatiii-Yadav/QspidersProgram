package collection.InnerClass;

public class OutLook implements Application{
    @Override
    public void open() {
        System.out.println("OutLook opened");
    }

    @Override
    public void close() {
        System.out.println("OutLook closed");
    }
}
