package JavaProgram.oops.polymorphism;

public class MainClassForTestEngine {
    public static void main(String[] args) {
        TestEngine.runTest(new TestEngineer());
        TestEngine.runTest(new AutomationTestEngineer());
        TestEngine.runTest(new ManualTestEngineer());
    }
}
