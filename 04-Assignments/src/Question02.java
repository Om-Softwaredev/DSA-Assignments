import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*

- answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
- answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.

**Note** that the integers in the lists may be returned in **any** order.

**Example 1:**

**Input:** nums1 = [1,2,3], nums2 = [2,4,6]

**Output:** [[1,3],[4,6]]

**Explanation:**

For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].

For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6]
 */
public class Question02 {
		public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int x:nums1){
            mp.put(x,1);
        }
        for(int x:nums2){
            if(mp.getOrDefault(x,0) == 1)
                mp.put(x,3);
            else if(mp.getOrDefault(x,0) == 0)
                mp.put(x,2);
        }
        List<Integer> f1 = new ArrayList<>();
        List<Integer> f2 = new ArrayList<>();
        for(int x:nums1){
            if(mp.getOrDefault(x,0) == 1){
                mp.put(x,0);
                f1.add(x);
            }
        }
        ans.add(f1);
        for(int x:nums2){
            if(mp.getOrDefault(x,0) == 2){
                mp.put(x,0);
                f2.add(x);
            }
        }
        ans.add(f2);
        return ans;
    }
	public static void main(String[] args) {
		int[] num1= {1,2,3};
		int[] num2= {2,4,6};
		List<List<Integer>> list=findDifference(num1,num2);
		System.out.println(Arrays.toString(list.toArray()));

	}

}
