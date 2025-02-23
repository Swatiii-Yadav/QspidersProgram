package designPatterns.creationalDesignPatten.abstractFactoryPattern;

public class FactoryProvider{
    public static ShapesFactory getFactory(String factoryType) {
        if (factoryType.equals("2D")) {
            return  new ShapeFactory2D();
        }
            else if (factoryType.equals("3D")) {
            return new ShapeFactory3D();
        }
        return null;
    }
}
