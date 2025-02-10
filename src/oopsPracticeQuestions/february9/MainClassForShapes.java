package oopsPracticeQuestions.february9;

public class MainClassForShapes {
    public static void main(String[] args) {
        Shapes s=new Shapes();
        s.area();
        Circle c=new Circle(5);
        System.out.println(c.area());
    }
}
