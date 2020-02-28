package SplitBalancedString;

/**
 * 1221. 分割平衡字符串
 *在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 *
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *
 * 返回可以通过分割得到的平衡字符串的最大数量。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 * 1. 统计每个字符出现的次数
 * 2. 一旦相同 说明出现 次数+1 清空字符出现次数
 */
public class Solution {
    public int balancedStringSplit(String s) {
        int Lc = 0;
        int Rc = 0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='L'){
                Lc++;
            }else{
                Rc++;
            }

            if(Lc == Rc){
                count++;
                Lc=0;
                Rc=0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "LLLLRRRR";
        Solution solution = new Solution();
        solution.balancedStringSplit(s);
    }
}
