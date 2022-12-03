package abstraction;

public class TestAbstraction {
    public static void main(String[] args) {

      //Phone.call(); cannot be static

    // Phone phone = new Phone();
        // you cannot create object because abstract method has not body
        // Abstract class cannot be instantiated means cannot create object.

        Samsung s1 = new Samsung();
        s1.call();
        s1.text();  // they are not abstract we can create object

        iPhone i1 = new iPhone();
        i1.call();
        i1.text();

        Samsung s2 = new Samsung(64, "Galaxy s20", "Black", 7000);
        iPhone i2 = new iPhone(70, "iPhone 13", "White", 2200);

        System.out.println(s2);
        System.out.println(i2);



    }


}
