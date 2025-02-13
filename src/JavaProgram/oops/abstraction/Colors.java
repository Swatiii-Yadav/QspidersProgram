package JavaProgram.oops.abstraction;

public interface Colors {
    void fill();
}
class Red implements Colors{

    @Override
    public void fill() {
        System.out.println("Red");
    }
}

class Blue implements Colors{

    @Override
    public void fill() {
        System.out.println("Blue");

    }
}
class Green implements Colors{

    @Override
    public void fill() {
        System.out.println("Green");

    }
}