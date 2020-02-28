package NineSixMaxNum;

/**
 * 1323. 6 和 9 组成的最大数字
 * 给你一个仅由数字 6 和 9 组成的正整数 num。
 * <p>
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 * <p>
 * 请返回你可以得到的最大数字。
 * <p>
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-69-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int maximum69Number(int num) {
        String str = String.valueOf(num).replaceFirst("6", "9");
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        int num = 9669;
        Solution solution = new Solution();
        solution.maximum69Number(num);
    }
}
