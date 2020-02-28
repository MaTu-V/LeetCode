package Grid;

/**
 * 1351. 统计有序矩阵中的负数
 * 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。
 * <p>
 * 请你统计并返回 grid 中 负数 的数目。
 *
 * 思路：
 * 1. 从右上开始
 * 2. 当出现大于等于 0 的数 则去计算 后面 负数的个数 计算完成移入下一行
 * 3. 当不出现 则让 col 列 往前移
 * 4. 循环结束后 判断row 是否到了最后
 * 5. 未到最后说明 存在行的第一个为负数的情况 统计负数
 *
 */
public class Solution {
    public int countNegatives(int[][] grid) {
        int row = 0, col = grid[0].length - 1;// 右上
        int count = 0;
        while (row < grid.length && col >= 0) {
            if (grid[row][col] >= 0) {
                count += grid[0].length - 1 - col;
                row++;
            } else {
                col--;
            }
        }

        while (row!=grid.length){
            count+=grid[0].length;
            row++;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {1,-1},
                {-1,-1}
//                {4, 3, 2, -1},
//                {3, 2, 1, -1},
//                {1, 1, -1, -2},
//                {-1, -1, -2, -3},
        };
        Solution solution = new Solution();
        solution.countNegatives(grid);

    }
}
