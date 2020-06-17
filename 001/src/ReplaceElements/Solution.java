package ReplaceElements;

import java.util.Arrays;

/**
 * 1299. 将每个元素替换为右侧最大元素
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * <p>
 * 完成所有替换操作后，请你返回这个数组。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 *  
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            res[i] = max;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        Solution solution = new Solution();
        solution.replaceElements(arr);
    }
}
