package MagicIndex;

/**
 * 面试题 08.03. 魔术索引
 * 魔术索引。 在数组A[0...n-1]中，有所谓的魔术索引，满足条件A[i] = i。给定一个有序整数数组，编写一种方法找出魔术索引，若有的话，在数组A中找出一个魔术索引，如果没有，则返回-1。若有多个魔术索引，返回索引值最小的一个。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/magic-index-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int findMagicIndex(int[] nums) {
        int num = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                num = i;
                break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,2};
        Solution solution = new Solution();
        solution.findMagicIndex(nums);
    }
}
