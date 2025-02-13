package JavaProgram.oops.abstraction;

public interface Languages {
    void write();
}

class Hindi  implements Languages{

    @Override
    public void write() {
        System.out.println("Hindi");
    }
}

class English  implements Languages{

    @Override
    public void write() {
        System.out.println("English");
    }
}
class Sanskrit  implements Languages{

    @Override
    public void write() {
        System.out.println("Sanskrit");
    }
}