package SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. 自除数
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * <p>
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * <p>
 * 还有，自除数不允许包含 0 。
 * <p>
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * 上边界left = 1, 下边界right = 22
 * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * 注意：
 * <p>
 * 每个输入参数的边界满足 1 <= left <= right <= 10000。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/self-dividing-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        boolean flag = true;
        while (left <= right) {
            flag = true;
            String str = left + "";
            for (int i = 0; i < str.length(); i++) {
                int num = str.charAt(i) - '0';
                if (num == 0) {
                    flag = false;
                } else {
                    if (left % num != 0) {
                        flag = false;
                    }
                }
            }
            // true则加入
            if (flag) {
                list.add(left);
            }
            left++;
        }
        for (Integer lis : list) {
            System.out.print(lis + "\t");
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.selfDividingNumbers(1, 22);
    }
}