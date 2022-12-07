package recap.abstraction;

public class Fish extends Creature {
    public Fish(String name, int legs, String breathingMethod, String reproducingMethod) {
        super(name, legs, breathingMethod, reproducingMethod);
    }


    public Fish(String name, int legs, String breathingMethod, String reproducingMethod, boolean hasFins) {
        super(name, legs, breathingMethod, reproducingMethod);
        this.hasFins = hasFins;
    }

    public boolean hasFins;

    @Override
    public void moving() {
        if (legs == 0) System.out.println(name +" can not walk");

        if (hasFins) System.out.println(name + " is swimming!");
        else System.out.println(name + " does not have fins and cannot swim!");


    }

    @Override
    public void breathing() {

        switch (breathingMethod.toLowerCase()) {
            case "lungs":
                System.out.println(name + " is air breathing");
                break;
            case "gills":
                System.out.println(name + " is water breathing");
                break;
            default:
                System.out.println("This breathing method does not exist");

        }

        System.out.println("It is using gills to use oxtgen!");

    }

    @Override
    public void reproduction() {

        switch (reproducingMethod.toLowerCase()){
            case "eggs":
                System.out.println(name + " is using eggs for reproduction!");
                break;
            case "giving birth":
                System.out.println(name + " is giving birth for reproduction");
                break;
            default:
                System.out.println("This reproduction method does not exist!");
        }

        System.out.println("Roe is called as fish eggs!");

    }


    public static void main(String[] args) {
        Fish fish = new Fish("Sam", 0, "gills", "eggs", true);


        fish.moving();
        fish.breathing();
        fish.reproduction();
        fish.living();


    }
}
