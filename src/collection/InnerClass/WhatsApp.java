package collection.InnerClass;

public class WhatsApp  implements Application{

    @Override
    public void open() {
        System.out.println("whatsApp opened");
    }

    @Override
    public void close() {
        System.out.println("whatsApp closed");

    }
}
