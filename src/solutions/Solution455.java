package solutions;

import java.util.Arrays;

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
