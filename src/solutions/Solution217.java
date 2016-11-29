package solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 *
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n: nums) {
            if (seen.contains(n)) return true;
            seen.add(n);
        }
        return false;
    }
}