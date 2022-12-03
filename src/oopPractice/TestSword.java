package oopPractice;

public class TestSword {
    public static void main(String[] args) {
        System.out.println("\nSword1 is created after this line\n");
        Sword sword1 = new Sword("Iron");// -> default constructor
        System.out.println("Printing out the sword1 = " + sword1);

        System.out.println("\nSword2 is created after this line\n");
        Sword sword2 = new Sword(3.5, 15.0, "long sword","iron"); // modified constructor.
        System.out.println("Printing out the sword2 = " + sword2);

        System.out.println("\nSword3 is created after this line\n");
        Sword sword3 = new Sword(10, 25.0, "super long sword","titanium"); // modified constructor.
        System.out.println("Printing out the sword2 = " + sword3);


        System.out.println(Sword.hasHandle);
        System.out.println(Sword.isSharp);
        Sword.damage();
        // final value can't be changed
       // Sword.hasHandle = false;
        Sword.isSharp = true;
        System.out.println("isSharp after = " + Sword.isSharp); // reassign value = true
        Sword.damage();




        Sword.slash();
        System.out.println("\nWorking non-static method\n");
        sword1.harms(); // 0
        sword2.harms(); // 3.5 * 15
        sword3.harms(); // 10 * 25.0 = 250.0

    }
}
