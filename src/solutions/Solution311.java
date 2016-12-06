package solutions;

/**
 * 311. Sparse Matrix Multiplication
 *
 * Given two sparse matrices A and B, return the result of AB.
 * You may assume that A's column number is equal to B's row number.
 *
 * Example:
 *
 * A = [
 *   [ 1, 0, 0],
 *   [-1, 0, 3]
 * ]
 *
 * B = [
 *   [ 7, 0, 0 ],
 *   [ 0, 0, 0 ],
 *   [ 0, 0, 1 ]
 * ]
 *
 *
 *      |  1 0 0 |   | 7 0 0 |   |  7 0 0 |
 * AB = | -1 0 3 | x | 0 0 0 | = | -7 0 3 |
 *                   | 0 0 1 |
 */

public class Solution311 {
    public int[][] multiply(int[][] A, int[][] B) {
        int nA = A.length, mA = A[0].length, nB = B[0].length;
        int[][] C = new int[nA][nB];
        for (int i = 0; i < nA; i++) {
            for (int k = 0; k < mA; k++) {
                if (A[i][k] == 0)
                    continue;
                for (int j = 0; j < nB; j++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
        return C;
    }
}