import java.util.*;

// ********************
// Palindrome Problem
// ********************
// Given an integer argument x, return true if x is a
// palindrome, and false if it is not.

// **********************
// Example Values of x
// **********************
// x = 121
// x = -121
// x = 10

// *********************************
// My interpretation / What I know
// *********************************
// A palindrome is a sequence, phrase, or word that reads the
// same forwards and backwards.
// - Example: the word "mom" and number 454 are both palindromes.

// **************
// My approach
// **************
// 1) Need to create a function that returns boolean true or false.
// 2) Function takes in an integer argument, int x
// 3) Should convert x into array of values that have the same type, such as an
//    array of char.
//    - Need array values to have same type, because x can be a negative
//      number, ie -121
// 4) Loop through char[] from start and end, comparing the starting and ending values
//    to each other, and iterating inwards to the center.
//    - Need to do this in order to determine if argument x is a palindrome.

public class Palindrome {
    public static boolean isValueAPalindrome(int x) {
        // *******************

        // Write logic here

        // *******************
        return false;
    }
    public static void main(String[] args) {
        int testValue_a = 121;
        int testValue_b = -121;
        int testValue_c = 35;


        System.out.println("Hello Palindrome Problem");
    }
}
