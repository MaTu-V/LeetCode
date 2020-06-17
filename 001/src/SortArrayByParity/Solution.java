package SortArrayByParity;

import java.util.Arrays;

/**
 * 905. 按奇偶排序数组
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 *
 *
 *
 * 示例：
 *
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *
 */
public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int start = 0;
        int end = A.length -1;
        for (int i = 0;i<A.length;i++){
            if (A[i]%2 == 0){
                res[start++] = A[i];
            }else {
                res[end--] = A[i];
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        int[] A = new int[]{
                3,1,2,4
        };
        Solution solution = new Solution();
        solution.sortArrayByParity(A);
    }
}
