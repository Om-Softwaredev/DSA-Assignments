/*
 * Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return *this repeated number*.

You must solve the problem **without** modifying the array `nums` and uses only constant extra space.

**Example 1:**
*Input: nums = [1,3,4,2,2]
Output: 2

 */
public class Question04 {

	public static int findRepeatedNumber(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        
        // Phase 1: Detect the intersection point of the tortoise and hare
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);
        
        // Phase 2: Find the entrance to the cycle (repeated number)
        int pointer1 = nums[0];
        int pointer2 = tortoise;
        while (pointer1 != pointer2) {
            pointer1 = nums[pointer1];
            pointer2 = nums[pointer2];
        }
        
        return pointer1;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Repeated number: " + findRepeatedNumber(nums)); // Output: 2
    }

}
