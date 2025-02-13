package oopsPracticeQuestions.february13;


public class ShapesToolKit {
    static void drawShapes(Shapes s) {
        if (s != null) {
            s.draw();
        }
    }

    static void deleteShapes(Shapes s) {
        if (s != null) {

            s.delete();

        }
    }

    static void editShapes(Shapes s) {
        if (s != null) {

            s.edit();
        }
    }
}
