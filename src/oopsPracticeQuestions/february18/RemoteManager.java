package oopsPracticeQuestions.february18;

public class RemoteManager {
    static void turnOnn(Remote remote) {
        if (remote != null) {
            if (remote.turnOn()) {
                System.out.println("turn onn");

            } else {
                System.out.println("turn off");
            }
        }

    }

    static void turnoff(Remote remote) {
        if (remote != null) {
            if (remote.turnOff()) {
                System.out.println("turn off");
            }
        }
    }

    static void volumeUp(Remote remote) {
        if (remote != null) {
            int vol = remote.VolumeUp();
            System.out.println("Volume is decresed at " + vol);
        }
    }



static void volumeDown(Remote remote) {
    if (remote != null) {
        int vol = remote.VolumeDown();
        System.out.println("Volume is decresed at " + vol);
    }

}
}
