package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 350. Intersection of Two Arrays II
 *
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 *
 * Note:
 * Each element in the result should appear as many times as it shows in both
 * arrays. The result can be in any order.
 *
 * Follow up:
 *  What if the given array is already sorted? How would you optimize?
 *  What if nums1.length << nums2.length? Which algorithm is better?
 *  What if elements of nums2 are stored on disk, and the memory is limited
 *  such that you cannot load all elements into the memory at once?
 */

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int[] smaller, bigger;
        if (nums1.length > nums2.length) {
            smaller = nums2; bigger = nums1;
        } else {
            smaller = nums1; bigger = nums2;
        }
        for (int n: smaller) {
            if (counts.containsKey(n))
                counts.replace(n, counts.get(n) + 1);
            else
                counts.put(n, 1);
        }
        int count;
        for (int n: bigger) {
            if (counts.containsKey(n)) {
                result.add(n);
                count = counts.get(n) - 1;
                if (count == 0) counts.remove(n);
                else counts.replace(n, count);
            }
            if (counts.isEmpty())
                break;
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            res[i] = result.get(i);
        return res;
    }
}