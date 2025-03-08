package oopsPracticeQuestions.march1TO8;

public class ClockServiceImpl {
    public void manageClock(Clock clock, String alarmTime) {
        clock.displayTime();
        
            clock.setAlarm(alarmTime);
       
    }
}
