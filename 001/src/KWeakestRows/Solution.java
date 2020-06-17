package KWeakestRows;

import java.util.Arrays;

/**
 * 1337. 方阵中战斗力最弱的 K 行
 * 给你一个大小为 m * n 的方阵 mat，方阵由若干军人和平民组成，分别用 0 和 1 表示。
 * <p>
 * 请你返回方阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。
 * <p>
 * 如果第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。
 * <p>
 * 军人 总是 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：mat =
 * [[1,1,0,0,0],
 * [1,1,1,1,0],
 * [1,0,0,0,0],
 * [1,1,0,0,0],
 * [1,1,1,1,1]],
 * k = 3
 * 输出：[2,0,3]
 * 解释：
 * 每行中的军人数目：
 * 行 0 -> 2
 * 行 1 -> 4
 * 行 2 -> 1
 * 行 3 -> 2
 * 行 4 -> 5
 * 从最弱到最强对这些行排序后得到 [2,0,3,1,4]
 */
public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        int[] all = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            int co = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) break;
                co += mat[i][j];
            }
            // 统计完当前行
            all[i]=co;
        }
        int[] allClone = all.clone();
        Arrays.sort(allClone);
        for (int i =0;i<k;i++){
            for (int j = 0;j<all.length;j++){
                if (allClone[i] == all[j]){
                    res[i] = j;
                    all[j] = -1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 3;
        Solution solution = new Solution();
        solution.kWeakestRows(mat, k);
    }
}
