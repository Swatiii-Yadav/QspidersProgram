package oopsPracticeQuestions.march1TO8;

interface CCTV{
     void turnOn();
     void turnOff();

    void startRecording();
     void stopRecording();
}

public class CctvCamera implements CCTV {
     private boolean isRecording = false;

     @Override
     public void turnOn() {
          System.out.println("Cctv Camera is turn ON.");
     }

     @Override
     public void turnOff() {
          System.out.println("CCTV Camera is turn OFF.");
     }

     public void startRecording() {
          if (!isRecording) {
               isRecording = true;
               System.out.println("recording started...");
          } else {
               System.out.println("already recording.");
          }
     }

     public void stopRecording() {
          if (isRecording) {
               isRecording = false;
               System.out.println("Recording stopped.");
          } else {
               System.out.println("Not recording.");
          }
     }
}
