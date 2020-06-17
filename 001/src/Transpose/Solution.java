package Transpose;

import java.util.Arrays;

/**
 * 867. 转置矩阵
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * <p>
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：[[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[1,4,7],[2,5,8],[3,6,9]]
 * 示例 2：
 * <p>
 * 输入：[[1,2,3],[4,5,6]]
 * 输出：[[1,4],[2,5],[3,6]]
 */
public class Solution {
    public int[][] transpose(int[][] A) {
        int[][] tran = new int[A[0].length][A.length];
        for (int i = 0;i<A.length;i++){ // 行
            for (int j = 0;j<A[0].length;j++) {// 列
                  tran[j][i] = A[i][j];
            }
        }
        // System.out.println(Arrays.toString(tran[0]));
        return  tran;
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{
                {1, 2, 3}, {4, 5, 6}
        };
        Solution solution = new Solution();
        solution.transpose(A);
    }
}
