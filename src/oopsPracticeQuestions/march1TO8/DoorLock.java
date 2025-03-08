package oopsPracticeQuestions.march1TO8;

interface SmartLock{
    void lock();
    void unlock();

}
public class DoorLock implements SmartLock{
    private boolean islocked = true;
    @Override
    public void lock() {
        if (islocked) {
            System.out.println("Door is already locked.");
        } else {
            islocked = true;
            System.out.println("Door locked successfully.");
        }
    }

    @Override
    public void unlock() {
        if (!islocked) {
            System.out.println("Door is already unlocked.");
        } else {
            islocked = false;
            System.out.println("Door unlocked successfully.");
        }
    }
}

