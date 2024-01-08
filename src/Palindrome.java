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
        // Convert int x to string, then convert string to array of char
        String xString = Integer.toString(x);
        char[] arrayOfChars = xString.toCharArray();

        // - Use nested loop to iterate through array of characters from start
        // and end, while checking if the active characters being compared are ==
        // or != to each other.
        // - If any two char values are not equal, return false because this means
        // int x is not a palindrome.
        // - Otherwise return true.
        for (int i = 0; i < arrayOfChars.length; i++) {
            for (int j = arrayOfChars.length - 1; j >= 0; j--) {
                if (arrayOfChars[i] != arrayOfChars[j]) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int testValue_a = 121;
        int testValue_b = -121;
        int testValue_c = 35;

        System.out.println(isValueAPalindrome(testValue_a));
        System.out.println(isValueAPalindrome(testValue_b));
        System.out.println(isValueAPalindrome(testValue_c));
    }
}
