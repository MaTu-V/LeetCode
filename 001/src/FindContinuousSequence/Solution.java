package FindContinuousSequence;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 面试题57 - II. 和为s的连续正数序列
 *
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 *
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 * 示例 2：
 *
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> list = new ArrayList<>();
        int i = 1; // 外围
        int max = target/2 + 1;
        while (i < max){
            int sum = i;
            for (int j = i+1;j<=max;j++){
                sum += j;
                if (sum == target){
                    int len = j - i + 1;
                    int[] res = new int[len];
                    // 记录
                    for (int k=0;k<len;k++){
                        res[k] = i+k;
                    }
//                    System.out.println(Arrays.toString(res));
                    list.add(res);
                    break;
                }
            }
            i++;
        }
        // 返回
        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findContinuousSequence(15);
    }
}
