package HammingDistance;

/**
 * 461. 汉明距离
 *
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 注意：
 * 0 ≤ x, y < 231.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/hamming-distance
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int res = x ^ y;
        int count = 0;
        while (res > 0) {
            count += res & 1;
//            System.out.println(res&1);
            res >>= 1;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.hammingDistance(1, 4);
    }
}
