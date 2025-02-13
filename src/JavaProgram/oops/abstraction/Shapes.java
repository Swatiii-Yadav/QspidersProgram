package JavaProgram.oops.abstraction;

 public interface Shapes {
   void draw();

}
 class Circle implements  Shapes{

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

}
 class Square implements  Shapes{

    @Override
    public void draw() {
        System.out.println("Drawing Square");

    }
}
 class Triangle implements  Shapes{

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");

    }


}