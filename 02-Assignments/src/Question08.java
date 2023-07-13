import java.util.Arrays;

/*
 * You are given an integer array nums and an integer k.

In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

Example 1:
Input: nums = [1], k = 0
Output: 0

Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
 */
public class Question08 {
	public static int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int length = A.length;
        int min = A[0], max = A[length - 1];
        int difference = max - min;
        return Math.max(0, difference - 2 * K);
    }
	public static void main(String[] args) {
		int[] arr= {1};
		System.out.println(smallestRangeI(arr,0));
	}

}
