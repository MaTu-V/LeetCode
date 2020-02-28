package DecompressEncodingList;


/**
 * 1313. 解压缩编码列表
 * 给你一个以行程长度编码压缩的整数列表 nums 。
 * <p>
 * 考虑每对相邻的两个元素 [a, b] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后有 a 个值为 b 的元素。
 * <p>
 * 请你返回解压后的列表。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decompress-run-length-encoded-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 思路：
 * 1. 求新数组长度
 * 2. 添加数据
 */
public class Solution {
    public int[] decompressRLElist(int[] nums) {
        if (nums.length < 2 || nums.length > 100 || nums.length % 2 != 0) {
            return null;
        }
        // 求新数组长度
        int len = 0;
        for (int i=0;i<nums.length;i+=2){
            len +=nums[i];
        }
        int[] res = new int[len];
        int k = 0,j=0;// 变量
        while (k < len) {
            int count = nums[j]; // 获取循环次数
            while (count--!=0){
                res[k] = nums[j+1];
                k++;
            }
            j+=2;
        }
//        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
//                              0  1 2  3  4  5
        int[] nums = new int[]{1, 2, 3, 4};
//        int[] nums = new int[]{55, 11, 70, 26, 62, 64};
//        int[] nums = new int[]{42, 39};
        Solution solution = new Solution();
        solution.decompressRLElist(nums);
    }
}
