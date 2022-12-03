package class_object;

import java.util.Arrays;

public class Apple_Exercise {
    /*
    Create three apple objects with below info

    apple1
    red
    0.5
    sweet

    apple2
    Yellow
    0.75
    Sweet

    apple3
    Green
    1.0
    sour

    Print all the objects

     */

    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();


        apple1.color = "Red";
        apple1.price = 0.5;
        apple1.taste = "Sweet";

        apple2.color = "Yellow";
        apple2.price = 0.75;
        apple2.taste = "Sweet";

        apple3.color = "Green";
        apple3.price = 1;
        apple3.taste = "Sour";

        System.out.println(apple1);
        System.out.println(apple2);
        System.out.println(apple3);

        /*
        Count how many apple objects are sweet

        exp out
        2
         */

        Apple[] apples = {apple1,apple2,apple3};
         int count = 0;
        for (Apple apple : apples) {
            if(apple.taste.equals("Sweet")) count++;

        }
        System.out.println(count); // 2


       // System.out.println(Arrays.toString(apples));
      //  System.out.println(apples.length); //3
      //  System.out.println(apples[1]);
      //  System.out.println(apples[2].taste); // sour

        System.out.println("\n-------------------TASK2------------------\n");
        /*
        Create 5 apple objects with 3 args constructor
        a1 - > Yellow,
         */



        Apple[] arr2 = {
                new Apple("Yellow", 0.5, "Sour"),
                new Apple("Red", 0.75, "Sour"),
                new Apple("Green", 0.5, "Sour"),
                new Apple("Yellow", 1.0, "Sweet"),
                new Apple("Yellow", 1.5, "Sweet")
        };

        for (Apple apple : arr2) {
            System.out.println(apple);

        }

        System.out.println("\n----------Retrive each info for each apple object and print it-------\n");

        for (Apple apple : arr2) {
            System.out.println(apple.color);
            System.out.println(apple.taste);
            System.out.println(apple.price);
            System.out.println("----------------");

        }












    }
}
