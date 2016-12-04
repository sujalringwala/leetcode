package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 248. Strobogrammatic Number III
 *
 * A strobogrammatic number is a number that looks the same when rotated 180
 * degrees (looked at upside down).
 *
 * Write a function to count the total strobogrammatic numbers that exist in
 * the range of low <= num <= high.
 *
 * For example,
 * Given low = "50", high = "100", return 3. Because 69, 88, and 96 are three
 * strobogrammatic numbers.
 *
 * Note:
 * Because the range might be a large number, the low and high numbers are
 * represented as string.
 */

public class Solution248 {

    public int strobogrammaticInRange(String low, String high) {
        int lower = 0, upper = 0, result = 0;
        long minNum = Long.parseLong(low);
        long maxNum = Long.parseLong(high);
        int minLen = low.length(), maxLen = high.length();

        if (minNum > maxNum) return 0;
        else if (minLen == maxLen) {
            for (String numStr : numbers(minLen, minLen)) {
                long curNum = Long.parseLong(numStr);
                if (minNum <= curNum && curNum <= maxNum) result++;
            }
            return result;
        } else {
            for (String numStr: numbers(minLen, minLen))
                if (Long.parseLong(numStr) < minNum) lower++;
            for (String numStr: numbers(maxLen, maxLen))
                if (Long.parseLong(numStr) <= maxNum) upper++;
            for (int len = minLen + 1; len < maxLen; len++)
                result += count(len);
            return count(minLen) - lower + upper + result;
        }
    }

    public int count(int len) {
        if (len <= 0) return 0;
        if (len == 1) return 3;
        int multiplier = (int)Math.pow(5, len / 2 - 1);
        return len % 2 == 0 ? 4 * multiplier: 12 * multiplier;
    }

    public List<String> numbers(int n, int t) {
        List<String> res = new ArrayList<>();
        if (n == 0) {
            res.add("");
            return res;
        } else if (n == 1) {
            res.add("0");
            res.add("1");
            res.add("8");
            return res;
        }
        for (String sub: numbers(n - 2, t)) {
            if (n != t) res.add("0" + sub + "0");
            res.add("1" + sub + "1");
            res.add("6" + sub + "9");
            res.add("8" + sub + "8");
            res.add("9" + sub + "6");
        }
        return res;
    }
}
