/*
 * Given a positive integer, N. Find the factorial of N. 

**Example 1:**

Input: N = 5 

Output: 120

**Example 2:**

Input: N = 4

Output: 24
 */
public class Question03 {

	public static int factorial(int N) {
        int fact = 1;
        
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 4;
        
        System.out.println(factorial(n1)); // Output: 120
        System.out.println(factorial(n2)); // Output: 24
    }

}
