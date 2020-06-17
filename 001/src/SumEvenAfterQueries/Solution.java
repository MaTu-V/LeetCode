package SumEvenAfterQueries;

import java.util.Arrays;

/**
 * 985. 查询后的偶数和
 * 给出一个整数数组 A 和一个查询数组 queries。
 * <p>
 * 对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。
 * <p>
 * （此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
 * <p>
 * 返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
 * 输出：[8,6,2,4]
 * 解释：
 * 开始时，数组为 [1,2,3,4]。
 * 将 1 加到 A[0] 上之后，数组为 [2,2,3,4]，偶数值之和为 2 + 2 + 4 = 8。
 * 将 -3 加到 A[1] 上之后，数组为 [2,-1,3,4]，偶数值之和为 2 + 4 = 6。
 * 将 -4 加到 A[0] 上之后，数组为 [-2,-1,3,4]，偶数值之和为 -2 + 4 = 2。
 * 将 2 加到 A[3] 上之后，数组为 [-2,-1,3,6]，偶数值之和为 -2 + 6 = 4。
 */
public class Solution {
    public int add(int[] A) {
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                res += A[i];
            }
        }
        return res;
    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = add(A);//初始化数组偶数和
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int idx = queries[i][1];
            int temp = A[idx] + queries[i][0]; // 相加后数据
            if (A[idx] % 2 == 0) { // 原本为偶数
                sum -= A[idx];
            }
            if (temp % 2 == 0) {
                // 说明为偶数应当加入
                sum += temp;
            }
            A[idx] =temp;
            answer[i] = sum;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4};
        int[][] queries = new int[][]{
                {1, 0}, {-3, 1}, {-4, 0}, {2, 3}
        };
        Solution solution = new Solution();
        solution.sumEvenAfterQueries(A, queries);
    }
}
