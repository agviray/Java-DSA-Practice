// ******************
// FizzBuzz Problem
// ******************
// You are given an integer, n, where 1 <= n
// For every integer i <= n, do the following:
// - If i is a multiple of 3 and 5, print "FizzBuzz"
// - If i is a multiple of 3 but not 5, print "Fizz"
// - If i is a multiple of 5 but not 3, print "Buzz"

public class FizzBuzz {
    public static void fizzBuzz(int n) {
        // n is >= 1
        for (int i = 1; i <= n; i++) {
            // First handle case resulting in "FizzBuzz".
            // Do this because there may be situations where i might be a multiple of both
            // 3 and 5.
            // If this case was handled last, the wrong word will be printed.

            // Example: If case i % 3 == 0 were to be handled first, and i = 15, the
            // word "Fizz" would be printed out.
            // - This would be incorrect because 15 is a multiple of both 3 and 5, so
            //   the word "FizzBuzz" should be printed out instead.
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzz(30);
    }
}
