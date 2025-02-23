package designPatterns.creationalDesignPatten.abstractFactoryPattern;

interface Shapes {
    void draw();
}
//


class Circle2D implements Shapes{

    @Override
    public void draw() {
        System.out.println("Drawing 2D circle  shapes ");
    }
}
class Triangle2D implements Shapes{

    @Override
    public void draw() {
        System.out.println("Drawing 2D triangle  shapes ");

    }
}


class Sphere3D implements   Shapes{

    @Override
    public void draw() {
        System.out.println("Drawing 3D square  shapes ");

    }
}
class Cone3D implements   Shapes{

    @Override
    public void draw() {
        System.out.println("Drawing 3D square  shapes ");

    }
}