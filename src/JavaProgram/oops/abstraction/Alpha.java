package JavaProgram.oops.abstraction;

abstract class Alpha {
    abstract  void play();
    void run(){
        System.out.println("executing run().....");
    }
}
class Beta extends Alpha{

    @Override
    void play() {
        System.out.println("executing play().....");

    }
}
