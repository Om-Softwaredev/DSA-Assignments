/*
 * Given a string, count total number of consonants in it. A consonant is an English alphabet character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, and g.

**Examples :**
*Input : abc de
Output : 3
There are three consonants b, c and d.

Input : geeksforgeeks portal
Output : 12
 */
public class Question08 {

	public static int countConsonants(String str) {
        int count = 0;
        
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (isConsonant(ch)) {
                count++;
            }
        }
        
        return count;
    }
    
    private static boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !isVowel(ch);
    }
    
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static void main(String[] args) {
        String str1 = "abc de";
        String str2 = "geeksforgeeks portal";
        
        System.out.println("Number of consonants in str1: " + countConsonants(str1)); // Output: 3
        System.out.println("Number of consonants in str2: " + countConsonants(str2)); // Output: 12
    }

}
