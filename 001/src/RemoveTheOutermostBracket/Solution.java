package RemoveTheOutermostBracket;

import java.util.Stack;

/**
 * 1021. 删除最外层的括号
 * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 * <p>
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 * <p>
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 * <p>
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 * <p>
 *  
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-outermost-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 * 1.栈对列
 * 2.遍历 当遇到（入栈 ）出栈
 * 3.则栈中只剩余（当下一个为 ） 导致栈空
 * 4.则删除对应res字符串的对应位置的（）括号
 */
public class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int start = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            res.append(c); // 加入
            if (c == '(') {
                stack.push(c);// 遇到左括号，入栈
            }else{
                // 出栈
                if (stack.peek()=='('){
                    stack.pop();
                    // 栈空 则删除字符串中外围括号 后重新计算字符串长度获取到下一个`（`位置
                    if (stack.empty()){
                        res.deleteCharAt(start);
                        res.deleteCharAt(res.length() -1 );
                        start = res.length();
                    }
                }
            }
        }
        System.out.println(res.toString());
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "(()())(())";
        Solution solution = new Solution();
        solution.removeOuterParentheses(str);
    }
}
