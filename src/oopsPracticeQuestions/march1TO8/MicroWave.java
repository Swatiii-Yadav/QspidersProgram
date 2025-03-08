package oopsPracticeQuestions.march1TO8;


public interface MicroWave {
    void setTimer(int seconds) throws Exception;
    void start();
    void stop();
}
class MicrowaveOperations implements MicroWave  {
    private boolean isRunning = false;
    private int timer = 0;

    @Override
    public void setTimer(int seconds) throws Exception {
        if (seconds <= 0) throw new DeviceException("Invalid timer!");
        this.timer = seconds;
        System.out.println("Timer set for " + seconds + " seconds.");
    }

    @Override
    public void start() {
        if (timer > 0) {
            isRunning = true;
            System.out.println("Microwave started.");
        } else {
            System.out.println("Set timer first.");
        }
    }

    @Override
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Microwave stopped.");
        } else {
            System.out.println("Microwave is not running.");
        }
    }

    void testMicrowave(MicrowaveOperations microwave) {
        try {
            microwave.setTimer(30);
            microwave.start();
            microwave.stop();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
