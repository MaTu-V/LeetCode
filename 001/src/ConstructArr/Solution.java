package ConstructArr;

import java.util.Arrays;

/**
 * 面试题66. 构建乘积数组
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 * <p>
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3,4,5]
 * 输出: [120,60,40,30,24]
 */
public class Solution {
    public int[] constructArr(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0, res = 1; i < a.length; i++) {
            b[i] = res;
            res *= a[i];
        }
        for (int i = a.length - 1, res = 1; i >= 0; i--) {
            b[i] *= res;
            res *= a[i];
        }
        System.out.println(Arrays.toString(b));
        return b;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        Solution solution = new Solution();
        solution.constructArr(a);
    }
}
