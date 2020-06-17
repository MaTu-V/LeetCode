package IsHappy;

import java.util.HashSet;

/**
 * 202. 快乐数
 * 编写一个算法来判断一个数是不是“快乐数”。
 * <p>
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * <p>
 * 示例:
 * <p>
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * <p>
 * 思路：
 * set实现 出现死循环 即代表不是快乐数
 */
public class Solution {
    // 求新数据
    public int newNum(int n) {
        int sum =0;
        int num;
        while (n!=0){
            num = n%10;
            n/=10;
            sum+=num*num;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n); // 添加
        while (n != 1) {
            n = newNum(n);
            if (set.contains(n)) return false;
            set.add(n);//再次放入
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(19));
    }
}
