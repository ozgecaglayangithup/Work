package class_object;

public class AppleTest {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = apple1;
        Apple myApple = apple2;

        System.out.println(apple1); // location
        System.out.println(apple2); // location
        System.out.println(myApple); // location

        // there is only 1 objects apple1.

        System.out.println(apple1.color);
        System.out.println(apple1.taste);
        System.out.println(apple1.price);

        apple2.color = "Green";
        System.out.println(apple2.color); // Green
        System.out.println(apple2.taste);
        System.out.println(apple2.price);



    }
}
