package HeightChecker;

import java.util.Arrays;

/**
 * 1051. 高度检查器
 *
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 *
 * 请你返回能让所有学生以 非递减 高度排列的最小必要移动人数。
 *
 *
 */
public class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = heights.clone();
        int count = 0;
        Arrays.sort(heights);
        for (int i = 0;i<heights.length;i++){
            if (temp[i]!=heights[i]) count++;
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        int[] heights = new int[]{1,1,4,2,1,3};
        Solution solution = new Solution();
        solution.heightChecker(heights);
    }
}
