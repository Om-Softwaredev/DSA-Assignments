/*
 * Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return *the only number in the range that is missing from the array.*

**Example 1:**
*Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

 */
public class Question03 {

	public static int findMissingNumber(int[] nums) {
        int missingNumber = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            missingNumber ^= i ^ nums[i];
        }
        
        return missingNumber;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Missing number: " + findMissingNumber(nums)); // Output: 2
    }

}
