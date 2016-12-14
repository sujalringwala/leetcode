package solutions;

/**
 * 80. Remove Duplicates from Sorted Array II
 *
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 *
 * For example,
 * Given sorted array nums = [1,1,1,2,2,3],
 *
 * Your function should return length = 5, with the first five elements of
 * nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the
 * new length.
 */

public class Solution080 {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1, k = 1, c = 1;

        while (j < nums.length) {
            if (nums[i] == nums[j] && c < 2) {
                nums[k] = nums[j];
                i = j;
                j++;
                k++;
                c++;
            } else if (nums[i] == nums[j] && c == 2) {
                j++;

            } else {
                nums[k] = nums[j];
                i = j;
                j++;
                k++;
                c = 1;
            }
        }
        return k;
    }
}