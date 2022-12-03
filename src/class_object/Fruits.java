package class_object;

public class Fruits {

    public static int numberOfFruits = 0;
    public static boolean hasColor;
    public boolean isSweet;
    public String name;
    public String shape;

    // instance block is excuted for each object being created
    {
        System.out.println("A new object of Fruit is created");
        numberOfFruits++;

    }


    {
      // if(this.name.equals("Watermelon")) isSweet = true; // This is an instance block
    }

    // Static blocks is execute only once and before everything else in the same class
    static {
        hasColor = true;
        System.out.println("This is a static block");
    }
}
