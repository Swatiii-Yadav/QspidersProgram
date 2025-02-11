package JavaProgram.oops.abstraction;

abstract class Demo {
    abstract void test();
    abstract void display();

}
class Sample extends  Demo{

    @Override
    void test() {
        System.out.println("Executing test method()......");
    }

    @Override
    void display() {
        System.out.println("Executing display method()......");

    }
}
