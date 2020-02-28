package ProductSum;

/**
 * 1281. 整数的各位积和之差
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decompress-run-length-encoded-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 * 1.求余数
 */
public class Solution {
    public int subtractProductAndSum(int n) {
        int mod = 10;
        int add = 0, pro = 1;
        while (n != 0) {
            pro *= n % mod;
            add += n% mod;
            n /= mod;
        }
        System.out.println(pro-add);
        return pro - add;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.subtractProductAndSum(4421);
    }
}
