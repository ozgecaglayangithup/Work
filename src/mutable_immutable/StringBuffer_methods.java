package mutable_immutable;

public class StringBuffer_methods {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");

        sb.insert(5, "snowy ");

        System.out.println(sb);
    }
}
