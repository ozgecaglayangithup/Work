package inheritance;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TesterClub {
    public static void main(String[] args) {

        FrontendTester ft1 = new FrontendTester("Othman", 23, "1993", "000", true);

        BackendTester bt1 = new BackendTester("John" , 45, "1982", "111", false);

        FrontendTester ft2 = new FrontendTester("Ozge", 29, "1998", "1234", false);

        BackendTester bt2 = new BackendTester("Ozan", 36, "1990", "2222", false);

        Tester[] testers = {ft1,ft2,bt1,bt2}; // POLYMORPHIC ARRAY

        /*
        Manual testers = 3
        Automation testers = 1
        Average age = 33
         */

        int count = 0;
        int countautomation = 0;
        int sum = 0;
        for (Tester tester : testers) {
            if (!tester.isAutomationTester) count++;
            else countautomation++;

            sum += tester.age;


        }
        System.out.println("Manuel tester = " + count);
        System.out.println("Automation tester = " + countautomation);
        System.out.println("Average age = " + sum / testers.length);


        //Counting with streaming
        System.out.println(Arrays.stream(testers).filter(x -> x.isAutomationTester).count());
        System.out.println(Arrays.stream(testers).filter(x -> !x.isAutomationTester).count());












    }
}
