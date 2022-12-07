package polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {

        Animal a1 = new Animal();

        a1.eat();
        a1.eat("meat");
        a1.sleep();

        Cat c1 = new Cat();
        c1.eat();
        c1.eat("Fish");
        c1.sleep();
        c1.meow();

        Dog d1 = new Dog();
        d1.eat();
        d1.eat("Bone");
        d1.sleep();
        d1.bark();


        /*
        Up-casting
        parent reference = child object
         */

        System.out.println("\n----------Up-Casting(implicity)-------------\n");
        Animal a2 = new Cat();
        Animal a3 = new Dog();

        a3.sleep(); // Dog sleeps

        // Up casting child object referenced by its parents

        System.out.println("\n----------Down-Casting(explicitly)---------------\n");

       // Cat cat = (Cat) new Animal(); // bad example of down - casting , CALASSCASTEXCEPTION
       // cat.meow();

        Animal myDog = new Dog(); // up-casting
        Dog newDog = (Dog) myDog;

        newDog.bark();

        // Animal a10 = new Cat();
     //   Dog d10 = (Dog) a10;   error










    }
}
