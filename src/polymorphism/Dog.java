package polymorphism;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dogs eats");
    }

    @Override
    public void eat(String food) {
        System.out.println("Dogs eats " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Dogs sleeps");
    }

    public void bark(){
        System.out.println("Dog barks");
    }
}
