package JavaProgram.oops.abstraction;

abstract class Delta {
    void send() {
        System.out.println("Executing send()...");
    }

    void help() {
        System.out.println("Executing help()...");
    }
}

class Example extends Delta {


}

public class MainClassDelta {
    public static void main(String[] args) {
        Delta obj = new Example();
        obj.send();
        obj.help();
    }
}