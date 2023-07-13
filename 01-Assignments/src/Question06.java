/*
 *
💡 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

Output: true


 */
public class Question06 {
	public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[j] == nums[i])    {
          return true;
        }
      }
    }
    return false;
  }
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));

	}

}
