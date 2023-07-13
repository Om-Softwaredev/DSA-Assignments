import java.util.HashMap;
import java.util.Map;
/*
 * Given two strings s and t, *determine if they are isomorphic*.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

**Example 1:**

**Input:** s = "egg", t = "add"

**Output:** true
 */
public class Question01 {

	public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToTMap = new HashMap<>();
        Map<Character, Character> tToSMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (sToTMap.containsKey(charS)) {
                if (sToTMap.get(charS) != charT) {
                    return false;
                }
            } else {
                sToTMap.put(charS, charT);
            }

            if (tToSMap.containsKey(charT)) {
                if (tToSMap.get(charT) != charS) {
                    return false;
                }
            } else {
                tToSMap.put(charT, charS);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean isIsomorphic = isIsomorphic(s, t);
        System.out.println(isIsomorphic);
    }

}
