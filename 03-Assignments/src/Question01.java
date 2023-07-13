import java.util.Arrays;

/*
 * Given an integer array nums of length n and an integer target, find three integers
in nums such that the sum is closest to the target.
Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2

Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class Question01 {
	 public static int threeSumClosest(int[] nums, int target) {
	        Arrays.sort(nums);
	        int n = nums.length;
	        int closest = nums[0] + nums[1] + nums[n - 1];
	        for (int i = 0; i < n - 2; i++) {
	            int j = i + 1;
	            int k = n - 1;
	            while (j < k) {
	                int sum = nums[i] + nums[j] + nums[k];
	                if (sum <= target) {
	                    j++;
	                } else {
	                    k--;
	                }
	                if (Math.abs(closest - target) > Math.abs(sum - target)) {
	                    closest = sum;
	                }
	            }
	        }
	        return closest;
	    }
	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		System.out.println(threeSumClosest(nums,1));
		
	}

}
