package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 247. Strobogrammatic Number II
 *
 * A strobogrammatic number is a number that looks the same when rotated 180
 * degrees (looked at upside down).
 *
 * Find all strobogrammatic numbers that are of length = n.
 *
 * For example,
 * Given n = 2, return ["11","69","88","96"].
 *
 * Hint:
 * Try to use recursion and notice that it should recurse with n - 2 instead
 * of n - 1.
 */

public class Solution247 {
    public List<String> findStrobogrammatic(int n) {
        return helper(n, n);
    }

    public List<String> helper(int n, int t) {
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
        for (String sub: helper(n - 2, t)) {
            if (n != t) res.add("0" + sub + "0");
            res.add("1" + sub + "1");
            res.add("6" + sub + "9");
            res.add("8" + sub + "8");
            res.add("9" + sub + "6");
        }
        return res;
    }
}