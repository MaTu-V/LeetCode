package PrintfOneEndN;

import java.util.Arrays;

/**
 * 面试题17. 打印从1到最大的n位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 */
public class Solution {
    public int[] printNumbers(int n) {
        int[] res = new int[(int) Math.pow(10, n) - 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + 1;
        }
       // System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        int n = 2;
        Solution solution = new Solution();
        solution.printNumbers(n);
    }
}
