
/*
 * A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

- s[i] == 'I' if perm[i] < perm[i + 1], and
- s[i] == 'D' if perm[i] > perm[i + 1].

Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return **any of them**.

**Example 1:**

**Input:** s = "IDID"

**Output:**

[0,4,1,3,2]
 */

public class Question01 {
	 public static int[] diStringMatch(String s) {
	        int[] arr = new int[s.length() + 1];
	        int max = s.length();
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == 'D') {
	                arr[i] = max;
	                max--;
	            }
	        }
	        for (int i = s.length() - 1; i >= 0 && max > 0; i--) {
	            if (s.charAt(i) == 'I' && arr[i + 1] == 0) {
	                arr[i + 1] = max;
	                max--;
	            }
	        }
	        for (int i = 0; i < arr.length && max > 0; i++) {
	            if (arr[i] == 0) {
	                arr[i] = max;
	                max--;
	            }
	        }

	        return arr;
	    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] perm = diStringMatch(s);
        for (int num : perm) {
            System.out.print(num + " ");
        }
    }
}

