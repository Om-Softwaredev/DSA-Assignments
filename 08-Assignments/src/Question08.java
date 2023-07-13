/*
 * Given two strings s and goal, return true *if you can swap two letters in* s *so the result is equal to* goal*, otherwise, return* false*.*

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

- For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

**Example 1:**

**Input:** s = "ab", goal = "ba"

**Output:** true

**Explanation:** You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
 */
public class Question08 {

	 public static boolean areAlmostEqual(String s, String goal) {
	        int n = s.length();
	        int firstMismatchIndex = -1;
	        int secondMismatchIndex = -1;

	        for (int i = 0; i < n; i++) {
	            if (s.charAt(i) != goal.charAt(i)) {
	                if (firstMismatchIndex == -1) {
	                    firstMismatchIndex = i;
	                } else if (secondMismatchIndex == -1) {
	                    secondMismatchIndex = i;
	                } else {
	                    return false;
	                }
	            }
	        }

	        if (firstMismatchIndex == -1 && secondMismatchIndex == -1) {
	            return true;
	        }

	        if (firstMismatchIndex != -1 && secondMismatchIndex != -1) {
	            return s.charAt(firstMismatchIndex) == goal.charAt(secondMismatchIndex) &&
	                    s.charAt(secondMismatchIndex) == goal.charAt(firstMismatchIndex);
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        String s = "ab";
	        String goal = "ba";
	        boolean result = areAlmostEqual(s, goal);
	        System.out.println(result);
	    }

}
