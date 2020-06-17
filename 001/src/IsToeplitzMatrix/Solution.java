package IsToeplitzMatrix;

import java.util.HashMap;

/**
 * 766. 托普利茨矩阵
 * 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
 *
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 *
 * 示例 1:
 *
 * 输入:
 * matrix = [
 *   [1,2,3,4],
 *   [5,1,2,3],
 *   [9,5,1,2]
 * ]
 * 输出: True
 * 解释:
 * 在上述矩阵中, 其对角线为:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
 * 各条对角线上的所有元素均相同, 因此答案是True。
 * 示例 2:
 *
 * 输入:
 * matrix = [
 *   [1,2],
 *   [2,2]
 * ]
 * 输出: False
 * 解释:
 * 对角线"[1, 2]"上的元素不同。
 */
public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i =0;i<row;i++){
            for (int j =0;j<col;j++){
                if (!map.containsKey(i - j)){
                    map.put(i - j,matrix[i][j]);
                }else {
                    //存在
                    if (map.get(i -j) != matrix[i][j]){
                        return  false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 2,3,4}, {5,1,2,3},{9,5,1,2}};
        Solution solution = new Solution();
        solution.isToeplitzMatrix(nums);
    }
}
