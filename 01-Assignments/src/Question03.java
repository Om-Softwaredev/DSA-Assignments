
public class Question03 {
/*
 *
💡 Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

**Example 1:**
Input: nums = [1,3,5,6], target = 5

Output: 2

 */
	public static int searchInsert(int[] nums, int target) {
        boolean flag = true;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target || nums[i]>target){
                flag=false;
               index= i;
               return i;
            }
        }
        if(flag){
            return nums.length;
        }else{
            return index;
        }
    }
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 5;
		
		System.out.println(searchInsert(nums,target));
		

	}

}
