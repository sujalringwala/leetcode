package solutions;

import java.util.List;

/**
 * 281. Zigzag Iterator
 *
 * Given two 1d vectors, implement an iterator to return their elements
 * alternately.
 *
 * For example, given two 1d vectors:
 *
 * v1 = [1, 2]
 * v2 = [3, 4, 5, 6]
 *
 * By calling next repeatedly until hasNext returns false, the order of
 * elements returned by next should be: [1, 3, 2, 4, 5, 6].
 *
 * Follow up: What if you are given k 1d vectors? How well can your code be
 * extended to such cases?
 *
 *
 */
public class Solution281 {
    public class ZigzagIterator {

        private int i = 0;
        private int j = 0;
        private final int size1;
        private final int size2;
        private final List<Integer> list1;
        private final List<Integer> list2;

        public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
            list1 = v1;
            list2 = v2;
            size1 = v1.size();
            size2 = v2.size();
        }

        public int next() {
            if (i == size1) return list2.get(j++);
            if (j == size2) return list1.get(i++);
            return i > j ? list2.get(j++): list1.get(i++);
        }

        public boolean hasNext() {
            return i < size1 || j < size2;
        }
    }
}
