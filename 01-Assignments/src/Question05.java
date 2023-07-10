/*
 * 
 */
public class Question05 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last1 = m-1;
        int last2 = n-1;
        
        int index = nums1.length-1;
        
        while (last1 >=0 && last2>=0) {
            int l = nums1[last1];
            int r = nums2[last2];
            
            if (l < r) {
                nums1[index--] = r;
                last2--;
            } else {
                nums1[index--] = l;
                last1--;
            }
        }
        
        while (last2 >=0) {
            int r = nums2[last2];
            
            nums1[index--] = r;
            last2--;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
