package Qspider.oops;

public class Rectangle {
    int length, breadth;
    double len, bre;

    Rectangle(int a, int b) {
        length = a;
        breadth = b;
    }

    Rectangle(double a, double b) {
        len = a;
        bre = b;
    }

    void area1() {
        System.out.println("Area of First  Rectangle"+length * breadth);
    }

    void area2() {
        System.out.println(("Area of  Second Rectangle"+len * bre));
    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(45, 67);
        r1.area1();
        Rectangle r2 = new Rectangle(4.5, 6.7);
        r2.area2();
    }
}
