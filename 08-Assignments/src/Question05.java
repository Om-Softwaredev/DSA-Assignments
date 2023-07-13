/*
 * Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of **consecutive repeating characters** in chars:

- If the group's length is 1, append the character to s.
- Otherwise, append the character followed by the group's length.

The compressed string s **should not be returned separately**, but instead, be stored **in the input character array chars**. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done **modifying the input array,** return *the new length of the array*.

You must write an algorithm that uses only constant extra space.

**Example 1:**

**Input:** chars = ["a","a","b","b","c","c","c"]

**Output:** Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

**Explanation:**

The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3"
 */
public class Question05 {
	 public static int compress(char[] chars) {
	        if (chars.length <= 1) {
	            return chars.length;
	        }

	        int writeIndex = 0;
	        int count = 1;

	        for (int i = 1; i <= chars.length; i++) {
	            if (i < chars.length && chars[i] == chars[i - 1]) {
	                count++;
	            } else {
	                chars[writeIndex++] = chars[i - 1];
	                if (count > 1) {
	                    String countStr = String.valueOf(count);
	                    for (char c : countStr.toCharArray()) {
	                        chars[writeIndex++] = c;
	                    }
	                }
	                count = 1;
	            }
	        }

	        return writeIndex;
	    }
	public static void main(String[] args) {
		char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        
        int newLength =compress(chars);

        System.out.println("New Length: " + newLength);
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
	}

}
