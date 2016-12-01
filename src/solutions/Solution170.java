package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 170. Two Sum III - Data structure design
 *
 * Design and implement a TwoSum class. It should support the following
 * operations: add and find.
 *
 * add - Add the number to an internal data structure.
 * find - Find if there exists any pair of numbers which sum is equal to value.
 *
 * For example,
 *
 * add(1); add(3); add(5);
 * find(4) -> true
 * find(7) -> false
 */

public class Solution170 {
    public class TwoSum {

        private Map<Integer, Integer> map = new HashMap<>();
        private List<Integer> list = new ArrayList<>();

        public void add(int number) {
            if (map.containsKey(number))
                map.put(number, map.get(number) + 1);
            else {
                map.put(number, 1);
                list.add(number);
            }
        }

        public boolean find(int value) {
            for (Integer n : list) {
                int m = value - n;
                if (m == n) {
                    if (map.get(n) > 1)
                        return true;
                } else if (map.containsKey(m))
                    return true;
            }
            return false;
        }
    }
}
