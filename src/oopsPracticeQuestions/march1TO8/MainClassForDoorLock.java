package oopsPracticeQuestions.march1TO8;

public class MainClassForDoorLock {
    public static void main(String[] args) {
        SmartLock myLock = new DoorLock();
        myLock.unlock();
        myLock.lock();
    }
}
