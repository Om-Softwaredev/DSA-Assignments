/*
 *
💡 You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3]


 */
public class Question08 {
	 public static int[] findErrorNums(int[] nums) {
		    int duplicate = 0;

		    for (final int num : nums) {
		      if (nums[Math.abs(num) - 1] < 0)
		        duplicate = Math.abs(num);
		      else
		        nums[Math.abs(num) - 1] *= -1;
		    }

		    for (int i = 0; i < nums.length; ++i)
		      if (nums[i] > 0)
		        return new int[] {duplicate, i + 1};

		    throw new IllegalArgumentException();
		  }
	public static void main(String[] args) {
		int[] nums= {1,2,2,4};
		int [] ans=findErrorNums(nums);
		for (int i : ans) {
			System.out.print(i+" ");
		}

	}

}
