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
//    included in the array, and n == nums.length.
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
                // Numbers in nums are sorted now, so if the num != index, then index is the missing number.
                missingNum = index;
                return missingNum;
            } else {
                // Increment as needed.
                index++;
            }
        }
        return missingNum;
    }

    public static void main(String[] args) {
        int[] test_a = {0, 1};
        int[] test_b = {3, 0, 1};
        int[] test_c = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("test_a expected output: " + 2);
        System.out.println("test_a actual output: " + findMissingNuber(test_a));
        System.out.println("\n");
        System.out.println("test_b expected output: " + 2);
        System.out.println("test_b output: " + findMissingNuber(test_b));
        System.out.println("\n");
        System.out.println("test_c expected output: " + 8);
        System.out.println("test_c actual output: " + findMissingNuber(test_c));

    }
}
