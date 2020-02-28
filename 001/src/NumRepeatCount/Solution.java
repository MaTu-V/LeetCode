package NumRepeatCount;

/**
 * 面试题03. 数组中重复的数字
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 * 1. 桶排序
 * 2. 当前桶中数量大于2 则退出
 */
public class Solution {
    public int findRepeatNumber(int[] nums) {
        int res = -1;
        int[] bucket = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            bucket[nums[i]]++;
            if (bucket[nums[i]] > 1){
                res = nums[i];
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,0,2,5,3};
        Solution solution = new Solution();
        solution.findRepeatNumber(nums);
    }
}
