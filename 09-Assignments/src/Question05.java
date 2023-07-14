/*
 * Given an array of integers **arr**, the task is to find maximum element of that array using recursion.

**Example 1:**

Input: arr = {1, 4, 3, -5, -4, 8, 6};
Output: 8

**Example 2:**

Input: arr = {1, 4, 45, 6, 10, -8};
Output: 45
 */
public class Question05 {

	 public static int findMaxElement(int[] arr, int startIndex, int endIndex) {
	        if (startIndex == endIndex) {
	            return arr[startIndex];
	        }
	        
	        int mid = (startIndex + endIndex) / 2;
	        
	        int leftMax = findMaxElement(arr, startIndex, mid);
	        int rightMax = findMaxElement(arr, mid + 1, endIndex);
	        
	        return Math.max(leftMax, rightMax);
	    }
	    
	    public static void main(String[] args) {
	        int[] arr1 = {1, 4, 3, -5, -4, 8, 6};
	        int[] arr2 = {1, 4, 45, 6, 10, -8};
	        
	        int max1 = findMaxElement(arr1, 0, arr1.length - 1);
	        int max2 = findMaxElement(arr2, 0, arr2.length - 1);
	        
	        System.out.println("Maximum element in arr1: " + max1); // Output: 8
	        System.out.println("Maximum element in arr2: " + max2); // Output: 45
	    }

}
