/*
 * An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true
 */
public class Question07 {
	public  static  boolean isMonotonic(int[] A) {
        boolean isincr = true;
        boolean isdec = true;
        int n=A.length;
        for (int i = 0; i < n- 1; ++i) {
            if (A[i] > A[i+1])
                isincr = false;
            if (A[i] < A[i+1])
               isdec = false;
        }
        return isincr || isdec;   
	}
	public static void main(String[] args) {
		int [] arr = {1,2,2,3}; 
	    boolean ans= isMonotonic(arr);
	    System.out.println(ans);
	}

}
