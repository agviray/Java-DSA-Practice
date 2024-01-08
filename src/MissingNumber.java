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
        // Organize values in nums by sorting them from least to greatest.
        Arrays.sort(nums);
        // Initialize missingNum to be length of nums.
        // - Plan is to iterate over nums, and compare nums[i] to a value that represents the
        //   current index of nums[i], because the index will always increment by 1.
        // - missingNum is initialized as nums.length in case the missing number is not equal
        //   to index of the last number in nums.
        int missingNum = nums.length;
        int index = 0;

        for (int num : nums) {
            // I am relying on index as the comparing value to num in nums, because index will
            // always only increment by 1.
            if (num != index) {
                // Numers in nums are sorted now, so if the num != index, then index is the missing number.
                missingNum = index;
                return missingNum;
            } else {
                // Increment as needed.
                index++;
            }
        }


    }

    public static void main(String[] args) {
        System.out.println("Hello Missing Number problem!");
    }
}
