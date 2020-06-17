package SmallestRangeI;

/**
 * 908. 最小差值 I
 * 给定一个整数数组 A，对于每个整数 A[i]，我们可以选择任意 x 满足 -K <= x <= K，并将 x 加到 A[i] 中。
 *
 * 在此过程之后，我们得到一些数组 B。
 *
 * 返回 B 的最大值和 B 的最小值之间可能存在的最小差值。
 *
 */
public class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min = A[0];
        int max = A[0];
        for(int i:A){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        System.out.printf(max + " "+ min);
        return Math.max(0,max-min- 2*K);
    }
    public static void main(String[] args) {
        int[] A = new int[]{0,10};
        int K = 0;
        Solution solution = new Solution();

        solution.smallestRangeI(A,K);
    }
}
