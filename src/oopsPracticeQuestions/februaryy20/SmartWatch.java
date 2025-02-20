package oopsPracticeQuestions.februaryy20;

import java.time.LocalTime;
import java.util.Date;
import java.util.Stack;

interface SmartWatch {
    LocalTime time();

    Date date();

    int battery();

    int steps();

    boolean music();

    Stack<String> notifications();


}

class DisplayWatch implements SmartWatch {

    LocalTime time;
    Date date;
    int step;
    boolean play;
    Stack<String> msg = new Stack<>();

    public DisplayWatch(LocalTime time, Date date, int step, boolean play, Stack<String> msg) {
        this.time = time;
        this.date = date;
        this.step = step;
        this.play = play;
        this.msg = msg;
    }


    @Override
    public LocalTime time() {
        return this.time;
    }

    @Override
    public Date date() {
        return this.date;
    }

    @Override
    public int battery() {
        return 0;
    }

    @Override
    public int steps() {
        return this.step;
    }

    @Override
    public boolean music() {
        return this.play;
    }

    @Override
    public Stack<String> notifications() {
        return this.msg;
    }

    public void addNotification(String message) {
        this.msg.push(message);

    }
}