import java.util.Arrays;

/*
 * An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.

Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.

**Example 1:**

**Input:** changed = [1,3,4,2,6,8]

**Output:** [1,3,4]

**Explanation:** One possible original array could be [1,3,4]:

- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.

Other original arrays could be [4,3,1] or [3,1,4]
 */
public class Question06 {

	public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        int n = changed.length;
        int[] original = new int[n / 2];
        int[] counts = new int[100001];

        for (int num : changed) {
            counts[num]++;
        }

        int index = 0;
        for (int i = 0; i <= 100000; i++) {
            while (counts[i] > 0) {
                if (counts[i * 2] <= 0) {
                    return new int[0];
                }

                original[index] = i;
                counts[i]--;
                counts[i * 2]--;
                index++;
            }
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        System.out.println(Arrays.toString(original));
    }


}
