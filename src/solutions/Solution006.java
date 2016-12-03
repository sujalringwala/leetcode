package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. ZigZag Conversion
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 */

public class Solution006 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        List<StringBuilder> builders = new ArrayList<>();
        for (int i = 0; i < numRows; i++)
            builders.add(new StringBuilder());

        boolean forward = true;
        int position = 0;

        for (int i = 0; i < s.length(); i++) {
            builders.get(position).append(s.charAt(i));
            if (i > 0 && (i % (numRows - 1) == 0))
                forward = forward ? false: true;
            if (forward) position++;
            else position--;
        }
        StringBuilder result = builders.get(0);
        for (int i = 1; i < builders.size(); i++)
            result.append(builders.get(i));
        return result.toString();
    }
}
