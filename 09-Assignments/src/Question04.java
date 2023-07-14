/*
 * Given a number N and a power P, the task is to find the exponent of this number raised to the given power, i.e. N^P.

**Example 1 :** 

Input: N = 5, P = 2

Output: 25

**Example 2 :**
Input: N = 2, P = 5

Output: 32
 */
public class Question04 {

	public static double calculateExponent(double n, double p) {
        double result = Math.pow(n, p);
        return result;
    }
    
    public static void main(String[] args) {
        double n1 = 5;
        double p1 = 2;
        double n2 = 2;
        double p2 = 5;
        
        System.out.println(calculateExponent(n1, p1)); // Output: 25.0
        System.out.println(calculateExponent(n2, p2)); // Output: 32.0
    }

}
