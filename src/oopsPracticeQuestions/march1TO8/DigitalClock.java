package oopsPracticeQuestions.march1TO8;

import java.text.SimpleDateFormat;

interface  Clock{
    void displayTime();
    void setAlarm(String time) ;
}

public class DigitalClock implements Clock {
    private String alarmTime;

    @Override
    public void displayTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String currentTime = formatter.format(new Date());
        System.out.println("Current Time: " + currentTime);
    }

    @Override
    public void setAlarm(String time)  {
        this.alarmTime = time;
        System.out.println("Alarm set for: " + time);
    }
}


