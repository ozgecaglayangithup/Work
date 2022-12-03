package mutable_immutable;

public class UnderstandingMutability {
    public static void main(String[] args) {

        String city = "Chicago"; // Chicago stays in the heap. there might be use for another thing.

        city = "Miami"; // it's also inside the string pool.

    }
}
