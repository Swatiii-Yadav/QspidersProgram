package JavaProgram.oops.instanceOf;

public class SoftwareEngineer {
    void meeting() {
        System.out.println("Meeting is executing()...");
    }
}

class Developer extends SoftwareEngineer {
    void codding() {
        System.out.println("Coding is executing()...");
    }

}

class Tester extends SoftwareEngineer {
    void testing() {
        System.out.println("Testing is executing()...");
    }
}