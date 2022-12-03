package oopPractice;

public class sunGlasses {

    public sunGlasses() {
    } // default constructor


    // Modified constructor
    public sunGlasses(String brandName, String color, int price, String design, boolean original) {
        this.brandName = brandName;
        this.color = color;
        this.price = price;
        this.design = design;
        this.original = original;

        // its aim distinquishes between local end instance variables, Or assign
    }


    // Instance variable


    //static

    public final static boolean hasGlass = true;
    public static boolean glassProtecter;


    // non - static
    public String brandName;
    public String color;
    public int price;
    public String design;
    public boolean original;

    // Methods
    public static void protectEyes() {
        if (glassProtecter) System.out.println("It's protects your eyes");
        else System.out.println("It's does not protect your eyes");
    }


    public void customerComfort() {
        if (original) System.out.println("SunGlasses has more comfort");
        else System.out.println("SunGlasses has not comfort");

    }

    @Override
    public String toString() {
        return "sunGlasses{" +
                "brandName='" + brandName + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", design='" + design + '\'' +
                ", original=" + original +
                '}';
    }
}




