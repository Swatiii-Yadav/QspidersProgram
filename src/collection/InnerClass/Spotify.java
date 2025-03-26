package collection.InnerClass;

public class Spotify implements Application {

    @Override
    public void open() {
        System.out.println("Spotify opened");
    }

    @Override
    public void close() {
        System.out.println("Spotify closed");
    }
}
