import java.util.Arrays;

/*
 * 
 *  Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	You can return the answer in any order.

 	**Example:**
	Input: nums = [2,7,11,15], target = 9
	Output0 [0,1]

**	Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1]
 */
public class Question01 {

	public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{-1,-1};
    }
	
	
	public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		int target = 9;
		
		int[] ans=twoSum(nums,target);
		System.out.println(Arrays.toString(ans));

	}

}
