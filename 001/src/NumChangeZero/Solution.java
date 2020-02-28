package NumChangeZero;

/**
 * 1342. 将数字变成 0 的操作次数
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decompress-run-length-encoded-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 思路：
 *
 */
public class Solution {
    public int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            // 偶数
            if (num % 2 == 0) {
                num /= 2;
            } else {
                // 奇数
                num -= 1;
            }
            step++;
        }
//        System.out.println(step);
        return step;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.numberOfSteps(8);
    }
}
