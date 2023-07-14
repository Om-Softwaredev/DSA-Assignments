import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given two integer arrays `nums1` and `nums2`, return *an array of their intersection*. Each element in the result must be **unique** and you may return the result in **any order**.

**Example 1:**
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
 */
public class Question05 {

	public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums1) {
            set.add(num);
        }
        
        List<Integer> intersectionList = new ArrayList<>();
        
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionList.add(num);
                set.remove(num); // Remove the element from set to avoid duplicates
            }
        }
        
        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            intersectionArray[i] = intersectionList.get(i);
        }
        
        return intersectionArray;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersectionArray = intersection(nums1, nums2);
        
        System.out.print("Intersection: ");
        for (int num : intersectionArray) {
            System.out.print(num + " ");
        }
    }
}
