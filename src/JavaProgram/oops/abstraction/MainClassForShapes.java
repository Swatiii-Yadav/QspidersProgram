package JavaProgram.oops.abstraction;

public class MainClassForShapes {
    public static void main(String[] args) {
        System.out.println("Drawing-------------------");
        ShapesToolKit.drawShapes(new Circle());
        ShapesToolKit.drawShapes(new Square());
        ShapesToolKit.drawShapes(new Triangle());



    }
}
