package solutions;

public class Solution136 {
    public int singleNumber(int[] nums) {
        int bits = 1;
        for (int num: nums)
            bits ^= num;
        return bits ^ 1;
    }
}
