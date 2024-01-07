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
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
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
