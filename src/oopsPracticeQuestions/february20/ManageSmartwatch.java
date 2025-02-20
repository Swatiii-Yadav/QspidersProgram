package oopsPracticeQuestions.february20;

public class ManageSmartwatch {

     static  public void display1(SmartWatch watch) {

        System.out.println(watch.battery() + "\n" + watch.time() + "\n" + watch.date() + "\n");
    }

     static  public void display2(SmartWatch watch) {
        System.out.println("Steps");
        System.out.println(watch.steps());

    }

     static public void display3(SmartWatch watch) {
        System.out.println("Music");
        System.out.println(watch.music());

    }

     static public void display4(SmartWatch watch) {
        System.out.println("Notification");
        for (String m:watch.notifications()){
            System.out.println(m);
        }
    }
}
