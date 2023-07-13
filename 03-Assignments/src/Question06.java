import java.util.HashSet;
import java.util.Iterator;

/*
 * Given a non-empty array of integers nums, every element appears twice except
for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only
constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1
 */
public class Question06 {
	public static int singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i:nums){
            if(!set.add(i)) 
                set.remove(i);
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
	public static void main(String[] args) {
		int[] nums = {2,2,1};
		System.out.println(singleNumber(nums));
	}

}
