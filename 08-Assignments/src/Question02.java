import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Given a string s containing only three types of characters: '(', ')' and '*', return true *if* s *is **valid***.

The following rules define a **valid** string:

- Any left parenthesis '(' must have a corresponding right parenthesis ')'.
- Any right parenthesis ')' must have a corresponding left parenthesis '('.
- Left parenthesis '(' must go before the corresponding right parenthesis ')'.
- '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

**Example 1:**

**Input:** s = "()"

**Output:**

true
 */
public class Question02 {

	public static boolean checkValidString(String s) {
        Deque<Integer> leftParenthesisStack = new ArrayDeque<>();
        Deque<Integer> asteriskStack = new ArrayDeque<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                leftParenthesisStack.push(i);
            } else if (c == '*') {
                asteriskStack.push(i);
            } else {
                if (!leftParenthesisStack.isEmpty()) {
                    leftParenthesisStack.pop();
                } else if (!asteriskStack.isEmpty()) {
                    asteriskStack.pop();
                } else {
                    return false;
                }
            }
        }

        while (!leftParenthesisStack.isEmpty() && !asteriskStack.isEmpty()) {
            int leftIndex = leftParenthesisStack.pop();
            int asteriskIndex = asteriskStack.pop();

            if (leftIndex > asteriskIndex) {
                return false;
            }
        }

        return leftParenthesisStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        boolean isValid = checkValidString(s);
        System.out.println(isValid);
    }

}
