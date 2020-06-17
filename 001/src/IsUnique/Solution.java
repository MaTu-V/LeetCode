package IsUnique;

import java.util.HashSet;

/**
 * 面试题 01.01. 判定字符是否唯一
 *
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 示例 1：
 *
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 *
 * 输入: s = "abc"
 * 输出: true
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/is-unique-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean isUnique(String astr) {
        HashSet<Character> set = new HashSet<>();
        char[] ch = astr.toCharArray();
        for (int i = 0;i<ch.length;i++){
            if (!set.contains(ch[i])){
                set.add(ch[i]);
            }else {
                break;
            }
        }
        System.out.println(set.size() == astr.length());
        return set.size() == astr.length();
    }
    public static void main(String[] args) {
        String astr ="abc";
        Solution solution = new Solution();
        solution.isUnique(astr);
    }
}
