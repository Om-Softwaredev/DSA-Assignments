import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an array nums of n integers, return an array of all the unique quadruplets
[nums[a], nums[b], nums[c], nums[d]] such that:
           ● 0 <= a, b, c, d < n
           ● a, b, c, and d are distinct.
           ● nums[a] + nums[b] + nums[c] + nums[d] == target

You may return the answer in any order.

Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 */
public class Question02 {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
 
        if(nums==null|| nums.length<4)
          return result;
 
        Arrays.sort(nums);
 
      for(int i=0; i<nums.length-3; i++){
        if(i!=0 && nums[i]==nums[i-1])
                continue;
        for(int j=i+1; j<nums.length-2; j++){
                if(j!=i+1 && nums[j]==nums[j-1])
                    continue;
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    if(nums[i]+nums[j]+nums[k]+nums[l]<target){
                        k++;
                    }else if(nums[i]+nums[j]+nums[k]+nums[l]>target){
                        l--;
                    }else{
                        List<Integer> t = new ArrayList<Integer>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        t.add(nums[l]);
                        result.add(t);
 
                        k++;
                        l--;
 
                        while(k<l &&nums[l]==nums[l+1] ){
                            l--;
                        }
 
                        while(k<l &&nums[k]==nums[k-1]){
                         k++;
                        }
                    }
                }
            }
        }
        return result;
    }
	public static void main(String[] args) {
		int[] nums= {1,0,-1,0,-2,2};
		int target =0;
		List<List<Integer>> list=fourSum(nums,target);
		System.out.println(Arrays.toString(list.toArray()));
		
	}

}
