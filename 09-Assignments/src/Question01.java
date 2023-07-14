/*
 * Given an integer `n`, return *`true` if it is a power of two. Otherwise, return `false`*.

An integer `n` is a power of two, if there exists an integer `x` such that `n == 2x`.

**Example 1:**
Input: n = 1 

Output: true

**Example 2:**
Input: n = 16 

Output: true

**Example 3:**
Input: n = 3 

Output: false
 */
public class Question01 {

	public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        
        // Check if the number has only one bit set to 1
        return (n & (n - 1)) == 0;
    }
    
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 16;
        int n3 = 3;
        
        System.out.println(isPowerOfTwo(n1)); // true
        System.out.println(isPowerOfTwo(n2)); // true
        System.out.println(isPowerOfTwo(n3)); // false
    }

}
