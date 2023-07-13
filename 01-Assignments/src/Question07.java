/*
 * 
💡 Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1:**
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]


 */
public class Question07 {
	public static void moveZeroes(int[] nums) {
	    // Start with the first position
	    int insertPosition = 0;

	    for (int i = 0; i < nums.length; i++) {
	      // Fill all non-zero numbers
	      if (nums[i] != 0) {
	        nums[insertPosition] = nums[i];
	        insertPosition++;
	      }
	    }
	    while (insertPosition < nums.length) {
	      nums[insertPosition++] = 0;
	    }
	    for (int i : nums) {
			System.out.print(i+" ");
		}
	  }

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}

}
