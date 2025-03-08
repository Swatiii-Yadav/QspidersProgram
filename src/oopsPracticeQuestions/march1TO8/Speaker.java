package oopsPracticeQuestions.march1TO8;

interface SmartSpeaker{
    void playMusic();
    void setAlarm(String time);

}


class Speaker implements SmartSpeaker {
    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void setAlarm(String time) {
        System.out.println("Alarm set for " + time);
    }
}



class DeviceService {
    void testSmartSpeaker(Speaker speaker) {
        speaker.playMusic();
        speaker.setAlarm("6:30 AM");
    }
}


