/*
 * Given a non-negative integer `x`, return *the square root of* `x` *rounded down to the nearest integer*. The returned integer should be **non-negative** as well.

You **must not use** any built-in exponent function or operator.

- For example, do not use `pow(x, 0.5)` in c++ or `x ** 0.5` in python.

**Example 1:**
*Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

 */
public class Question01 {

	public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        
        int left = 1;
        int right = x;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid > x / mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Square root of " + x + ": " + mySqrt(x)); // Output: 2
    }

}
