package mutable_immutable;

public class Practice_StringBuilder {
    public static void main(String[] args) {

        StringBuilder city = new StringBuilder("Chicago");

        System.out.println(city);

        city = new StringBuilder("Miami"); // Chicago will be destroyed.Mutable

        String name = "Alex";
        name += "ander"; // Alexander

        city.append("xxx");
        System.out.println(city); // Miamixxx it will be just updated in the heap.

    }
}
