package PeakIndexInMountainArray;

/**
 * 852. 山脉数组的峰顶索引
 * 我们把符合下列属性的数组 A 称作山脉：
 *
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 *
 *
 *
 * 示例 1：
 *
 * 输入：[0,1,0]
 * 输出：1
 * 示例 2：
 *
 * 输入：[0,2,1,0]
 * 输出：1
 *
 */
public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for(int i=1;i<A.length - 1;i++){
            if(A[i] > A[i + 1] && A[i] > A[i-1]){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] data = new int[]{0,1,0};
        Solution solution = new Solution();
        solution.peakIndexInMountainArray(data);
    }
}
