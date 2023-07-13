import java.util.HashMap;
import java.util.Map;

/*
 * Given a string num which represents an integer, return true *if* num *is a **strobogrammatic number***.

A **strobogrammatic number** is a number that looks the same when rotated 180 degrees (looked at upside down).

**Example 1:**

**Input:** num = "69"

**Output:**

true
 */
public class Question02 {

	 public static boolean isStrobogrammatic(String num) {
	        Map<Character, Character> strobogrammaticMap = new HashMap<>();
	        strobogrammaticMap.put('0', '0');
	        strobogrammaticMap.put('1', '1');
	        strobogrammaticMap.put('6', '9');
	        strobogrammaticMap.put('8', '8');
	        strobogrammaticMap.put('9', '6');

	        int left = 0;
	        int right = num.length() - 1;

	        while (left <= right) {
	            char leftChar = num.charAt(left);
	            char rightChar = num.charAt(right);

	            if (!strobogrammaticMap.containsKey(leftChar) || strobogrammaticMap.get(leftChar) != rightChar) {
	                return false;
	            }

	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String num = "69";
	        boolean isStrobogrammatic = isStrobogrammatic(num);
	        System.out.println(isStrobogrammatic);
	    }

}
