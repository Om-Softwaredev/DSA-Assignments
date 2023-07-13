/*
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

**Example 1:**

**Input:** s = "Let's take LeetCode contest"

**Output:** "s'teL ekat edoCteeL tsetnoc"
 */
public class Question04 {

	 public static String reverseWords(String s) {
	        String[] words = s.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word);
	            reversedWord.reverse();
	            result.append(reversedWord).append(" ");
	        }

	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        String s = "Let's take LeetCode contest";
	        String reversed = reverseWords(s);
	        System.out.println(reversed);
	    }

}
