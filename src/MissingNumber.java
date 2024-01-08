import java.util.*;

// ************************
// Missing Number Problem
// ************************
// Given an array, nums, containing n distinct numbers in the
// range [0, n], return the only number in the range that is  from
// missing the array.

// ***********************
// Constraints
// ***********************
// n == nums.length
// 1 <= n <= 10^4
// 0 <= nums[i] <= n
// All nums are unique

// *********************************
// My interpretation / What I know
// *********************************
// 1) We are given array of unique numbers, set to argument nums.
//    - So argument is: int[] nums
// 2) int[] nums contains numbers from 0 to n, where 0 and n are
//    included in the array.
// 3) The numbers are NOT sorted at all.
// 4) There is a single number missing from the range. Return this
//    missing number.

// ****************************
// My FIRST/INITIAL approach
// ****************************
// 1) Sort the array of numbers from least to greatest, to have an organized array to review.
// 2) General thought is to iterate through nums while comparing nums[i]
//    to another value.

// ********************************
// Other Details About My Solution
// ********************************
// None
public class MissingNumber {
    public static int findMissingNuber (int[] nums) {
        // ***************
        // logic goes here
        // ***************
        return 0;

    }

    public static void main(String[] args) {
        System.out.println("Hello Missing Number problem!");
    }
}
