import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given two integer arrays `nums1` and `nums2`, return *an array of their intersection*. Each element in the result must appear as many times as it shows in both arrays and you may return the result in **any order**.

**Example 1:**
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
 */
public class Question08 {

	public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap1 = new HashMap<>();
        Map<Integer, Integer> freqMap2 = new HashMap<>();
        
        for (int num : nums1) {
            freqMap1.put(num, freqMap1.getOrDefault(num, 0) + 1);
        }
        
        for (int num : nums2) {
            freqMap2.put(num, freqMap2.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> intersectionList = new ArrayList<>();
        
        for (int num : freqMap1.keySet()) {
            if (freqMap2.containsKey(num)) {
                int freq = Math.min(freqMap1.get(num), freqMap2.get(num));
                for (int i = 0; i < freq; i++) {
                    intersectionList.add(num);
                }
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
        int[] intersectionArray = intersect(nums1, nums2);
        
        System.out.print("Intersection: ");
        for (int num : intersectionArray) {
            System.out.print(num + " ");
        }
    }

}
