package class_object;

import java.util.ArrayList;
import java.util.Arrays;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("White", "BMW", "X6", 2020, 15000);
        Car car2 = new Car("Black", "Tesla", "S", 2023, 20000);
        Car car3 = new Car("Beige", "Toyota", "Camry", 2018, 10000);
        Car car4 = new Car("Blue", "Tesla", "X", 2021, 13000);
        Car car5 = new Car("Black", "Audi", "A7", 2022, 15000);

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1,car2,car3,car4,car5));

        System.out.println("\n-------------Print each car------------\n");
        cars.forEach(System.out::println);

        /*
        Find the most expensive car
        Find the cheapest car
        Remove all the cars that has price more than 20k
         */

        Car mostExpensive  = cars.get(0);
        for (Car car : cars) {
            if(car.price > mostExpensive.price) mostExpensive = car;

        }
        System.out.println(mostExpensive);

        Car moreCheap = cars.get(0);
        for (Car car : cars) {
            if(car.price < moreCheap.price) moreCheap = car;

        }
        System.out.println(moreCheap);

        System.out.println("\n--------------COUNT BLACK CARS------------\n");

        int count = 0;
        for (Car car : cars) {
            if(car.color.equals("Black")) count++;

        }
        System.out.println(count);

        System.out.println("\n----------------STREAM METHOD-----------------\n");

        System.out.println(cars.stream().filter(car -> car.color.equals("Black")).count()); // 2


       /*
       Count all the cars that are Blue or Beige or 2023
        */ // 3

        int counter = 0;
        for (Car car : cars) {
            if (car.color.equals("Blue") || car.color.equals("Beige") || car.year == 2023)
                counter++;

        }
        System.out.println(counter);


       /*
       Remove all the cars are tesla and print the size of the cars
       // 3
      */

        cars.removeIf(car -> car.make.equals("Tesla"));
        System.out.println(cars.size());

    }
}
