package designPatterns.creationalDesignPatten.abstractFactoryPattern;

import java.util.Scanner;

public class MainClassForShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose Factory (2D/3D): ");
        String factoryType = scanner.nextLine();

        ShapesFactory shapeFactory = FactoryProvider.getFactory(factoryType);
        if (shapeFactory == null) {
            System.out.println("invalid");
            return;
        }

        System.out.print("Choose Shape --> circle/triangle for 2D shapes , Sphere/Cone for 3D : ");
        String shapeType = scanner.nextLine();

        Shapes shape = shapeFactory.createShapes(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Shapes  not define");
        }
    }
}
