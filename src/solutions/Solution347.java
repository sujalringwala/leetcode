package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 347. Top K Frequent Elements
 *
 * Given a non-empty array of integers, return the k most frequent elements.
 *
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 *
 * Note:
 *
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is
 * the array's size.
 */

public class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num: nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (int num: counts.keySet()) {
            int count = counts.get(num);
            if (buckets[count] == null)
                buckets[count] = new ArrayList<>();
            buckets[count].add(count);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && res.size() < k; i--) {
            res.addAll(buckets[i]);
        }
        return res.subList(0, k);
    }
}
