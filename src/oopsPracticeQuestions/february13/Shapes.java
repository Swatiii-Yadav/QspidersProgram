package oopsPracticeQuestions.february13;

 public interface Shapes {
   void draw();
   void delete();
   void edit();
}
class Circle implements  Shapes{

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public void delete() {
        System.out.println("Deleting circle");

    }

    @Override
    public void edit() {
        System.out.println("Editing circle");

    }
}
class Square implements  Shapes{

    @Override
    public void draw() {
        System.out.println("Drawing Square");

    }

    @Override
    public void delete() {
        System.out.println("Deleting Square");

    }

    @Override
    public void edit() {
        System.out.println("Editing square");

    }
}
class Triangle implements  Shapes{

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");

    }

    @Override
    public void delete() {
        System.out.println("Deleting Triangle");

    }

    @Override
    public void edit() {
        System.out.println("Editing triangle");

    }
}