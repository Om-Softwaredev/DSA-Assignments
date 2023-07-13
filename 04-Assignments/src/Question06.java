import java.util.Arrays;

/*
 * <aside>
💡 Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

**Example 1:**

Input: nums = [-4,-1,0,3,10]

Output: [0,1,9,16,100]

**Explanation:** After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100]

</aside>
 */
public class Question06 {
	public static int[] sortedSquares(int[] A) {
	    int[] res = new int[A.length];
	    for(int i = 0; i < A.length; i++){
	        res[i] = A[i] * A[i];
	    }
	    Arrays.sort(res);
	    return res;
	}
	public static void main(String[] args) {
		int[] arr ={-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(arr)));

	}

}
