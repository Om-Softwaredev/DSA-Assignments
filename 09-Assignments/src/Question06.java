/*
 * Given first term (a), common difference (d) and a integer N of the Arithmetic Progression series, the task is to find Nth term of the series.

**Example 1:**

Input : a = 2 d = 1 N = 5
Output : 6
The 5th term of the series is : 6

**Example 2:**

Input : a = 5 d = 2 N = 10
Output : 23
The 10th term of the series is : 23
 */
public class Question06 {

	public static int findNthTerm(int a, int d, int n) {
        int nthTerm = a + (n - 1) * d;
        return nthTerm;
    }
    
    public static void main(String[] args) {
        int a1 = 2;
        int d1 = 1;
        int n1 = 5;
        
        int a2 = 5;
        int d2 = 2;
        int n2 = 10;
        
        System.out.println("The " + n1 + "th term of the series is: " + findNthTerm(a1, d1, n1)); // Output: 6
        System.out.println("The " + n2 + "th term of the series is: " + findNthTerm(a2, d2, n2)); // Output: 23
    }
}
