package EvenDigits;

/**
 * 1295. 统计位数为偶数的数字
 * <p>
 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 *
 * 思路
 * 1. 数字转字符串
 * 2. + "" 方式时间效率高
 * 3. 使用 String.valueof转换
 *
 */
public class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if ((String.valueOf(nums[i]).length()) %2 == 0){
                count++;
            }
        }
//        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12, 345, 2, 6, 7896};
        Solution solution = new Solution();
        solution.findNumbers(nums);
    }
}
