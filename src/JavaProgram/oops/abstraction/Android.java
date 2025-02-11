package JavaProgram.oops.abstraction;

abstract class Android {
    void services(){

    }
    abstract void ui();
}
class Samsung extends Android{

    @Override
    void ui() {
        System.out.println("galaxy OS");
    }

}
class Vivo extends Android{

    @Override
    void ui() {
        System.out.println("Fun touch  OS");
    }

}
class Oppo extends Android{

    @Override
    void ui() {
        System.out.println("color OS");
    }

}