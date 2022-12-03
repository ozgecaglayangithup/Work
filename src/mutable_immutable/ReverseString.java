package mutable_immutable;

public class ReverseString {

    /*
    Write a method that takes a String and returns it back reversed

    Hello - > olleH
    Java - > avaJ

    "a" - > "a"
    "1234" - > "4321"

    Good morning - > gninrom dooG
     */

    public static String reverseString(String str) {
     //   StringBuilder result = new StringBuilder(str);
      //  result.reverse();
     //   return result.toString();

        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {

    //   return new StringBuilder(str).reverse().toString().equals(str);

        return str.equals(new StringBuilder(str).reverse().toString());

    }



}
