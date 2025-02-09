package oopsPracticeQuestions.february9;

//Shape Hierarchy: Shape (parent), Circle, Rectangle, Triangle (child)
//        area(), perimeter(), Overriding area()
public class Shapes {
    Shapes() {

    }

    double area() {
        return 0;
    }

    double perimeter() {
        return 0;
    }
}

class Circle extends Shapes {
    double pi = (double) 22 / 7;
    int radius;

    Circle(int radius) {

        this.radius = radius;
    }

    @Override
    double area() {
        return pi*radius*radius;
    }

    @Override
    double perimeter() {
        return 2*pi*radius;
    }
}

class Rectangle extends Shapes {
    double height;
    double width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double area() {
        return height*width;
    }

    @Override
    double perimeter() {
        return 2*(height+width);
    }
}

