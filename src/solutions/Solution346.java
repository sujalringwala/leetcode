package solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 346. Moving Average from Data Stream
 *
 * Given a stream of integers and a window size, calculate the moving average
 * of all integers in the sliding window.
 *
 * For example,
 *
 * MovingAverage m = new MovingAverage(3);
 * m.next(1) = 1
 * m.next(10) = (1 + 10) / 2
 * m.next(3) = (1 + 10 + 3) / 3
 * m.next(5) = (10 + 3 + 5) / 3
 */

public class Solution346 {
    public class MovingAverage {

        private int capacity, sum;
        private Queue<Integer> nums;

        public MovingAverage(int size) {
            capacity = size;
            sum = 0;
            nums = new LinkedList<>();
        }

        public double next(int val) {
            nums.add(val);
            sum += val;
            if (nums.size() > capacity)
                sum -= nums.remove();
            return (double)sum / nums.size();
        }
    }
}

