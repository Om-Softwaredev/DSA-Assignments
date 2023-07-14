/*
 * We are given a string S, we need to find count of all contiguous substrings starting and ending with same character.
 * Examples :
 * Input  : S = "abcab"
Output : 7
There are 15 substrings of "abcab"
a, ab, abc, abca, abcab, b, bc, bca
bcab, c, ca, cab, a, ab, b
Out of the above substrings, there
are 7 substrings : a, abca, b, bcab,
c, a and b.

Input  : S = "aba"
Output : 4
The substrings are a, b, a and aba
 */
public class Question05 {

	 
   public static boolean checkEquality(String s)
    {
        return (s.charAt(0) == s.charAt(s.length() - 1));
    }
      
   public static int countSubstringWithEqualEnds(String s)
    {
        int result = 0;
        int n = s.length();
      
        for (int i = 0; i < n; i++)
      
           for (int len = 1; len <= n-i; len++)
      
              if (checkEquality(s.substring(i, i + len)))
                result++;
      
        return result;
    }
      
    public static void main(String args[])
    {
        String s = "abcab";
        System.out.println(countSubstringWithEqualEnds(s));
    }

}
