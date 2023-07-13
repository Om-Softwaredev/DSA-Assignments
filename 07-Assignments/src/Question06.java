/*
 * Given two strings s and goal, return true *if and only if* s *can become* goal *after some number of **shifts** on* s.

A **shift** on s consists of moving the leftmost character of s to the rightmost position.

- For example, if s = "abcde", then it will be "bcdea" after one shift.

**Example 1:**

**Input:** s = "abcde", goal = "cdeab"

**Output:**

true
 */
public class Question06 {

	 public static boolean rotateString(String s, String goal) {
	        if (s.length() != goal.length()) {
	            return false;
	        }

	        String doubledS = s + s;

	        return doubledS.contains(goal);
	    }

	    public static void main(String[] args) {
	        String s = "abcde";
	        String goal = "cdeab";
	        boolean canRotate = rotateString(s, goal);
	        System.out.println(canRotate);
	    }

}
