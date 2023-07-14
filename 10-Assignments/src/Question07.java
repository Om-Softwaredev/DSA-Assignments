/*
 * Given a string **str**, the task is to print all the permutations of **str**. A **permutation** is an arrangement of all or part of a set of objects, with regard to the order of the arrangement. For instance, the words ‘bat’ and ‘tab’ represents two distinct permutation (or arrangements) of a similar three letter word.

**Examples:**

> Input: str = “cd”
> 
> 
> **Output:** cd dc
> 
> **Input:** str = “abb”
> 
> **Output:** abb abb bab bba bab bba
>
 */
public class Question07 {

	public static void printPermutations(String str) {
        char[] charArray = str.toCharArray();
        printPermutationsHelper(charArray, 0);
    }
    
    private static void printPermutationsHelper(char[] charArray, int currentIndex) {
        if (currentIndex == charArray.length - 1) {
            System.out.println(String.valueOf(charArray));
            return;
        }
        
        for (int i = currentIndex; i < charArray.length; i++) {
            swap(charArray, currentIndex, i);
            printPermutationsHelper(charArray, currentIndex + 1);
            swap(charArray, currentIndex, i); // Backtrack
        }
    }
    
    private static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
    
    public static void main(String[] args) {
        String str1 = "cd";
        String str2 = "abb";
        
        System.out.println("Permutations of str1:");
        printPermutations(str1);
        
        System.out.println("\nPermutations of str2:");
        printPermutations(str2);
    }

}
