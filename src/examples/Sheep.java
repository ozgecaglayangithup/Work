package examples;

public class Sheep extends Animal {


    public Sheep(String name, int age, boolean isHerbivore, boolean isOmnivore, boolean isCarnivore) {
        super(name, age, isHerbivore, isOmnivore, isCarnivore);
    }



    @Override
    public void eats() {
        System.out.println("Sheep eats");
    }

    @Override
    public void eats(String food) {
        System.out.println("Sheep eats" + food);
    }

    @Override
    public void sleeps() {
        System.out.println("Sheep sleeps");
    }




    public static void main(String[] args) {
       Sheep animal1 = new Sheep("ak", 4, true, false, false);
        System.out.println(animal1);
        animal1.eats();
        animal1.eats(" plants");
        animal1.sleeps();
    }
}

