package examples;

public class Animal {


   public  Animal(String name, int age) {
       this.name = name;
       this.age = age;

   }


    public Animal(String name, int age, boolean isHerbivore, boolean isOmnivore, boolean isCarnivore) {
        this(name,age);
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
        this.isCarnivore = isCarnivore;
    }

    public String name;
    private int age;
    public boolean isHerbivore;
    public boolean isOmnivore;
    public boolean isCarnivore;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eats(){
        System.out.println("Animal eats");
    }

    public void eats(String food) {
        System.out.println("Animal eats " + food);
    }


    public void sleeps(){
        System.out.println("Animal sleeps");
    }


    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + getAge() +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                ", isCarnivore=" + isCarnivore +
                '}';
    }
}
