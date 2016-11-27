package solutions;

public class Solution389 {
    public char findTheDifference(String s, String t) {
        int bits = 1;
        for (char c: s.toCharArray())
            bits ^= (int)c;
        for (char c: t.toCharArray())
            bits ^= (int)c;
        return (char)(bits ^ 1);
    }
}