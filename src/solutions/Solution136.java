package solutions;

/**
 * 136. Single Number
 *
 * Given an array of integers, every element appears twice except for one.
 * Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 */

public class Solution136 {
    public int singleNumber(int[] nums) {
        int bits = 1;
        for (int num: nums)
            bits ^= num;
        return bits ^ 1;
    }
}