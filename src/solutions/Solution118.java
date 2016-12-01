package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 118. Pascal's Triangle
 *
 * Given numRows, generate the first numRows of Pascal's triangle.
 *
 * For example, given numRows = 5, return:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;

        result.add(Arrays.asList(1));
        if (numRows == 1) return result;

        List<Integer> last = Arrays.asList(1, 1);
        result.add(last);
        if (numRows == 2) return result;

        for (int i = 3; i <= numRows; i++) {
            List<Integer> current = new ArrayList<Integer>();
            current.add(1);
            for (int j = 0, k = 1; k < last.size(); j++, k++)
                current.add(last.get(j) + last.get(k));
            current.add(1);
            result.add(current);
            last = current;
        }
        return result;
    }
}
