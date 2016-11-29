package solutions;

import java.util.Arrays;

/**
 * 455. Assign Cookies
 *
 * Assume you are an awesome parent and want to give your children some cookies.
 * But, you should give each child at most one cookie. Each child i has a greed
 * factor gi, which is the minimum size of a cookie that the child will be
 * content with; and each cookie j has a size sj. If sj >= gi, we can assign
 * the cookie j to the child i, and the child i will be content. Your goal is to
 * maximize the number of your content children and output the maximum number.
 *
 * Note:
 * You may assume the greed factor is always positive.
 * You cannot assign more than one cookie to one child.
 */

public class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        int i = 0, j = 0, res = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (i < g.length && j < s.length) {
            if (g[i] > s[j]) {
                j++;
            } else {
                res++;
                i++;
                j++;
            }
        }
        return res;
    }
}