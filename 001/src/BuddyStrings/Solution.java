package BuddyStrings;

import java.util.ArrayList;

/**
 * 859. 亲密字符串
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入： A = "ab", B = "ba"
 * 输出： true
 * 示例 2：
 * <p>
 * 输入： A = "ab", B = "ab"
 * 输出： false
 * 示例 3:
 * <p>
 * 输入： A = "aa", B = "aa"
 * 输出： true
 * 示例 4：
 * <p>
 * 输入： A = "aaaaaaabc", B = "aaaaaaacb"
 * 输出： true
 * 示例 5：
 * <p>
 * 输入： A = "", B = "aa"
 * 输出： false
 *
 * 思路：
 * 1. 字符串长度不相等 返回false
 * 2. 记录不相同字符出现
 * 3. 当list长度为0说明两个字符串一样 如果A中存在重复出现元素 则代表交换重复元素仍可以达到B
 *    否则 返回false
 * 4. 判断list长度是否为2 不为2 说明多个字符位置不匹配返回false
 *    否则交换 1 0  0 1 中元素判断A B 对应位置是否一样
 */
public class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                list.add(i);
            }
        }

        if (list.size() == 0) { // == 0 相同
            for (int i = 1; i < A.length(); i++) { // 判断A 中字符是否重复出现
                if (A.indexOf(A.charAt(i)) != i) {
                    return true;
                }
            }
            return false;
        }

        return list.size() == 2 && (A.charAt(list.get(0)) == B.charAt(list.get(1)))
                && (A.charAt(list.get(1)) == B.charAt(list.get(0)));
    }


    public static void main(String[] args) {
        String A = "aaaaaabc";
        String B = "aaaaaacb";
        Solution solution = new Solution();
        System.out.println(solution.buddyStrings(A, B));
    }
}