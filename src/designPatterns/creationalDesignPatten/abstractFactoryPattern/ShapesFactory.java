package designPatterns.creationalDesignPatten.abstractFactoryPattern;

public interface ShapesFactory {
    Shapes createShapes(String shapeType);

}
class ShapeFactory2D implements ShapesFactory{

    @Override
    public Shapes createShapes(String shapeType) {
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle2D();
        } else if (shapeType.equalsIgnoreCase("Triangle")) {
            return new Triangle2D();
        }
        return null;
    }
}

class ShapeFactory3D implements ShapesFactory{

    @Override
    public Shapes createShapes(String shapeType) {
        if (shapeType.equalsIgnoreCase("Sphere")) {
            return new Circle2D();
        } else if (shapeType.equalsIgnoreCase("Triangle")) {
            return new Triangle2D();
        }
        return null;
    }
}