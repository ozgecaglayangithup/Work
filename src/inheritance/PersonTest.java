package inheritance;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Alex", 25);
        Person p3 = new Person("John", 35, "10/10/2000");
        Person p4 = new Person("Jane", 35, "07/08/1995");

       Tester t1 = new Tester();
       Tester t2 = new Tester("Ozge", 15);

       p1.eat();
       t1.eat();

       p1.sleep();
       t1.sleep();
    }
}
