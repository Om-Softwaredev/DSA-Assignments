/*
 * Given a number n, find the sum of the first natural numbers.

**Example 1:**

Input: n = 3 

Output: 6

**Example 2:**

Input  : 5 

Output : 15
 */
public class Question02 {

	public static int sumOfFirstNNumbers(int n) {
        int sum = n * (n + 1) / 2;
        return sum;
    }
    
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        
        System.out.println(sumOfFirstNNumbers(n1)); // Output: 6
        System.out.println(sumOfFirstNNumbers(n2)); // Output: 15
    }

}
