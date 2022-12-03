package inheritance;

public class FrontendTester extends Tester {

    // 5 arg constructor


    public FrontendTester() {
    }

    public FrontendTester(String fName, int age, String DOB, String SSN, boolean isAutomationTester) {
        super(fName, age, DOB, SSN, isAutomationTester);
    }
}
