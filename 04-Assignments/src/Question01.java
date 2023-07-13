/*
 * <aside>
💡 Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order, return a sorted array of **only** the integers that appeared in **all** three arrays.

**Example 1:**

Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]

Output: [1,5]

**Explanation:** Only 1 and 5 appeared in the three arrays.

</aside>
 */
public class Question01 {

	    public static void findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
	        int n1 = arr1.length;
	        int n2 = arr2.length;
	        int n3 = arr3.length;
	        int i = 0;
	        int j = 0; 
	        int k = 0; 
	        
	        while (i < n1 && j < n2 && k < n3) {
	            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
	                System.out.print(arr1[i]+" ");
	                i++; j++; k++;
	            }else if (arr1[i] < arr2[j]) {
	                i++;
	            }else if (arr2[j] < arr3[k]) {
	                j++; 
	            }else {
	                k++; 
	            }
	        }
	    }
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,5,7,9};
        int[] arr3 = {1,3,4,5,8};
        
        findCommonElements(arr1, arr2, arr3);

	}

}
