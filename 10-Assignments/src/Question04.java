/*
 * Given a string calculate length of the string using recursion.

**Examples:**
*Input : str = "abcd"
Output :4

Input : str = "GEEKSFORGEEKS"
Output :13
 */
public class Question04 {

	public static int calculateLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        
        return 1 + calculateLength(str.substring(1));
    }
    
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "GEEKSFORGEEKS";
        
        System.out.println("Length of str1: " + calculateLength(str1)); // Output: 5
        System.out.println("Length of str2: " + calculateLength(str2)); // Output: 4
    }

}
