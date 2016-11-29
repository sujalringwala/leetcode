package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

/**
 * 229. Majority Element II
 *
 * Given an integer array of size n, find all elements that appear more than
 * ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.
 */

public class Solution229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int n1 = nums[0];
        int n2 = nums[0];
        int c1 = 0;
        int c2 = 0;
        for (int n: nums) {
            if (n == n1) c1++;
            else if (n == n2) c2++;
            else if (c1 == 0) {n1 = n; c1 = 1;}
            else if (c2 == 0) {n2 = n; c2 = 1;}
            else {c1--; c2--;}
        }
        c1 = 0;
        c2 = 0;
        for (int n: nums) {
            if (n == n1) c1++;
            else if (n == n2) c2++;
        }
        if (c1 > nums.length / 3) result.add(n1);
        if (c2 > nums.length / 3) result.add(n2);
        return result;
    }
}
