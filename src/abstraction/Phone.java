package abstraction;

public abstract class Phone {

    /*
    We can have all class members
    constructors
    methods
    instance variables
    blocks
     */

   public Phone(){} // default

    public Phone(int storage, String model, String color, double price) {
        this.storage = storage;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public int storage;
    public String model;
    public String color;
    public double price;

   public abstract void call(); // created to be implemented by sub-classes
    public abstract void text();  // created to be implemented by sub-classes

    public void rings(){
        System.out.println("Phones rings");
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "storage=" + storage +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
