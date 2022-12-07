package examples;

public class Tiger extends Animal {


    public Tiger(String name, int age, boolean isHerbivore, boolean isOmnivore, boolean isCarnivore) {
        super(name, age, isHerbivore, isOmnivore, isCarnivore);
    }


    @Override
    public void eats() {
        System.out.println("Tiger eats");
    }

    @Override
    public void eats(String food) {
        System.out.println("Tiger eats " + food);
    }

    @Override
    public void sleeps() {
        System.out.println("Tiger sleeps");
    }




    public static void main(String[] args) {

        Animal animal2 = new Tiger("Aslan" , 3, false, true, false);
        System.out.println(animal2);
        animal2.eats();
        animal2.eats("Meat");
        animal2.sleeps();
    }


}
