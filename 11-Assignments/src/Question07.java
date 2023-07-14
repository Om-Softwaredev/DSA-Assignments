/*
 * Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

**Example 1:**
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 */
public class Question07 {

	public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        int startIndex = findStartIndex(nums, target);
        
        if (startIndex == -1) {
            return result;
        }
        
        int endIndex = findEndIndex(nums, target);
        
        result[0] = startIndex;
        result[1] = endIndex;
        
        return result;
    }
    
    private static int findStartIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int startIndex = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            
            if (nums[mid] == target) {
                startIndex = mid;
            }
        }
        
        return startIndex;
    }
    
    private static int findEndIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int endIndex = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            
            if (nums[mid] == target) {
                endIndex = mid;
            }
        }
        
        return endIndex;
    }
    
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        
        System.out.println("Range: [" + result[0] + ", " + result[1] + "]"); // Output: [3, 4]
    }

}
