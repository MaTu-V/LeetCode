package SumZero;

import java.util.Arrays;

/**
 * 1304. 和为零的N个唯一整数
 * <p>
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 */
public class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum+=i;
            res[i - 1] = i;
        }
        res[n - 1] = -sum;
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sumZero(5);
    }
}
