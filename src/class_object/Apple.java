package class_object;

public class Apple {

    // default constructor is provided by java to create zero arguments objects
    public  Apple() {
        // Each time you created a new objects, this block will be excuted.
        System.out.println("This is the default constructor");
    }
    //Overloading constructor with 3 args
    public Apple(String color, double price , String taste) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }

        // instance variables - fields - states - attributes

    public String color; // null
    public double price; // 0.0
    public String taste; // null

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
        // you'll get the actual values
    }
}
