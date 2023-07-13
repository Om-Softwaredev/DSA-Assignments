import java.util.ArrayList;
import java.util.List;

/*
 * Given two strings s and p, return *an array of all the start indices of* p*'s anagrams in* s. You may return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

**Input:** s = "cbaebabacd", p = "abc"

**Output:** [0,6]

**Explanation:**

The substring with start index = 0 is "cba", which is an anagram of "abc".

The substring with start index = 6 is "bac", which is an anagram of "abc".
 */
public class Question06 {

	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        int pLength = p.length();
        int sLength = s.length();

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int left = 0;
        int right = 0;

        while (right < sLength) {
            sCount[s.charAt(right) - 'a']++;

            if (right - left + 1 > pLength) {
                sCount[s.charAt(left) - 'a']--;
                left++;
            }

            if (right - left + 1 == pLength) {
                if (isAnagram(pCount, sCount)) {
                    result.add(left);
                }
                sCount[s.charAt(left) - 'a']--;
                left++;
            }

            right++;
        }

        return result;
    }

    private static boolean isAnagram(int[] pCount, int[] sCount) {
        for (int i = 0; i < 26; i++) {
            if (pCount[i] != sCount[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
       
        List<Integer> indices =findAnagrams(s, p);
        System.out.println(indices);
    }

}
