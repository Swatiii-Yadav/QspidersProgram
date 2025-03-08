package oopsPracticeQuestions.march1TO8;

interface ManageLift{
    void turnOn() throws DeviceException;
    void turnOff() throws DeviceException;
}
public class Lift  implements  ManageLift {
    private int currentFloor = 0;
    private final int totalFloors;

    public Lift(int totalFloors) {
        this.totalFloors = totalFloors;
        System.out.println("Lift initialized with " + totalFloors + " floors.");
    }

    @Override
    public void turnOn() {
        System.out.println("Lift system is now online.");
    }

    @Override
    public void turnOff() {
        System.out.println("Lift system is now offline.");
    }

    public void moveUp() throws DeviceException {
        if (currentFloor < totalFloors) {
            currentFloor++;
            System.out.println("Lift moved up to floor: " + currentFloor);
        } else {
            throw new DeviceException("Already at top floor.");
        }
    }

    public void moveDown() throws DeviceException {
        if (currentFloor > 0) {
            currentFloor--;
            System.out.println("Lift moved down to floor: " + currentFloor);
        } else {
            throw new DeviceException("Already at ground floor.");
        }

    }
}
