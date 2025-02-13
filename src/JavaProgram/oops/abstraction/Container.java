package JavaProgram.oops.abstraction;

public interface Container {
    void store();

}
class Bottle implements Container{

    @Override
    public void store() {
        System.out.println("Store liquid ");
    }
}

class Bag implements Container{

    @Override
    public void store() {
        System.out.println("Store laptop ");
    }
}
class Box implements  Container{

    @Override
    public void store() {
        System.out.println("Store  solid");
    }
}