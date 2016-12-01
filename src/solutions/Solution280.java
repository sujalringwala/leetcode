package solutions;

/**
 * 280. Wiggle Sort
 *
 * Given an unsorted array nums, reorder it in-place such that
 * nums[0] <= nums[1] >= nums[2] <= nums[3]....
 *
 * For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is
 * [1, 6, 2, 5, 3, 4].
 *
 * Solution:
 * We want a number to be larger than the previous (nums[i] > previous) if and
 * only if it's at an odd index (i%2 == 1).
 *
 */

public class Solution280 {
    public void wiggleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int previous = nums[i-1];
            if ((nums[i] > previous) != (i % 2 == 1)) {
                nums[i-1] = nums[i];
                nums[i] = previous;
            }
        }
    }
}