package solutions;

import java.util.LinkedList;
import java.util.Queue;

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

