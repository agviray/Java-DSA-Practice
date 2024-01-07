// **************************
// Sum of Two Values Problem
// **************************
// Given an array of integers and a value, determine if there are any two
// integers in the array whose sum is equal to the given value.
// Return true if the sum exists, and return false if it does not.

// *********************************
// My interpretation / What I know
// *********************************
// 1) Need to create a function that returns boolean value, true or false.
// 2) Function will take 2 arguments: an int[] numsArray, and int targetSum
// 3) Need to take two numbers in numsArray and calculate their sum.
// - Immediately return true if sum equals targetSum.
// - If sum of numbers not equal to targetSum, return false.

public class SumOfTwoValues {
    public static boolean sumOfTwoValues(int[] numsArray, int targetSum) {
        for (int i = 0; i < numsArray.length; i++) {
            for (int j = numsArray.length - 1; j >= 0; j--) {
                if (numsArray[i] + numsArray[j] == targetSum) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbersArray_01 = {2,1,8,4,7,3};
        int sumTarget_01 = 3;

        int[] numbersArray_02 = {2,1,8,4,7,3};
        int sumTarget_02 = 20;

        System.out.println(sumOfTwoValues(numbersArray_02,sumTarget_02));
    }
}
