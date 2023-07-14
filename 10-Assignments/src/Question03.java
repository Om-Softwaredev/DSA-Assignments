/*
 * Given a set represented as a string, write a recursive code to print all subsets of it. The subsets can be printed in any order.

**Example 1:**

Input :  set = “abc”

Output : { “”, “a”, “b”, “c”, “ab”, “ac”, “bc”, “abc”}

**Example 2:**

Input : set = “abcd”

Output : { “”, “a” ,”ab” ,”abc” ,”abcd”, “abd” ,”ac” ,”acd”, “ad” ,”b”, “bc” ,”bcd” ,”bd” ,”c” ,”cd” ,”d” }
 */
public class Question03 {

	public static void printSubsets(String set) {
        printSubsetsHelper(set, "", 0);
    }
    
    private static void printSubsetsHelper(String set, String subset, int index) {
        if (index == set.length()) {
            System.out.println(subset);
            return;
        }
        
        printSubsetsHelper(set, subset + set.charAt(index), index + 1);
        
        printSubsetsHelper(set, subset, index + 1);
    }
    
    public static void main(String[] args) {
        String set1 = "abc";
        String set2 = "abcd";
        
        System.out.println("Subsets of set1:");
        printSubsets(set1);
        
        System.out.println("\nSubsets of set2:");
        printSubsets(set2);
    }

}
