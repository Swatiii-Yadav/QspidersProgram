package JavaProgram.oops.abstraction;

public class MainClassForContainer {
    public static void main(String[] args) {
        StorageContainer.storage(new Bottle());
        StorageContainer.storage(new Bag());
        StorageContainer.storage(new Box());
    }
}
