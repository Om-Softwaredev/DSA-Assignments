/*
 * Given two strings s and t, return true *if they are equal when both are typed into empty text editors*. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

**Example 1:**

**Input:** s = "ab#c", t = "ad#c"

**Output:** true

**Explanation:**

Both s and t become "ac".
 */
public class Question07 {

	public static boolean backspaceCompare(String s, String t) {
        String finalS = processString(s);
        String finalT = processString(t);

        return finalS.equals(finalT);
    }

    private static String processString(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean areEqual = backspaceCompare(s, t);
        System.out.println(areEqual);
    }

}
