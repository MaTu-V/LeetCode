package TwoSum;

/**
 * 面试题57. 和为s的两个数字
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 * 示例 2：
 *
 * 输入：nums = [10,26,30,31,47,60], target = 40
 * 输出：[10,30] 或者 [30,10]
 *
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if( nums[left] + nums[right] == target){
                res[0] = nums[left];
                res[1] = nums[right];
                return res;
            }else if(nums[left] + nums[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        Solution solution = new Solution();
        solution.twoSum(nums,9);
    }
}
