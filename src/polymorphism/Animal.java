package polymorphism;

public class Animal {

    public void eat(){
        System.out.println("This animal is eats");
    }



    public void eat(String food) {
        System.out.println("Animal eats " + food);
    } // this overloaded eat method with different argument

    public void sleep() {
        System.out.println("Animal sleeps");
    }
}
