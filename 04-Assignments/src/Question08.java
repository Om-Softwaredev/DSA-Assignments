import java.util.Arrays;

/*
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

*Return the array in the form* [x1,y1,x2,y2,...,xn,yn].

**Example 1:**

**Input:** nums = [2,5,1,3,4,7], n = 3

**Output:** [2,3,5,4,1,7]

**Explanation:** Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
public class Question08 {
	public static int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[nums.length];

        for(int i = 0; i < n; i++){
            result[i*2] = nums[i];
        }

        for(int j = 1; j < n+1; j++) {
            result[(j*2)-1] = nums[n+j-1];
        }
        
        return result;
    }
	public static void main(String[] args) {
		int[] nums= {2,5,1,3,4,7};
		System.out.println(Arrays.toString(shuffle(nums,3)));

	}

}
