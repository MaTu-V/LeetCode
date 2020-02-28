package DecodeStringAtIndex;

/**
 * 880. 索引处的解码字符串
 * <p>
 * 给定一个编码字符串 S。为了找出解码字符串并将其写入磁带，从编码字符串中每次读取一个字符，并采取以下步骤：
 * <p>
 * 如果所读的字符是字母，则将该字母写在磁带上。
 * 如果所读的字符是数字（例如 d），则整个当前磁带总共会被重复写 d-1 次。
 * 现在，对于给定的编码字符串 S 和索引 K，查找并返回解码字符串中的第 K 个字母。
 * <p>
 *  
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decoded-string-at-index
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 * 1. 获取总长度
 * 2. 倒叙  获取之前被循环字符串的长度
 * 3. K%被循环字符串长度
 * 4. 输出
 */
public class Solution {
    public String decodeAtIndex(String S, int K) {
        char[] chs = S.toCharArray();
        long size = 0;
        for (int i = 0;i<chs.length;i++){
            if (chs[i] >='a' && chs[i] <='z'){
                // 字符
                ++size;
            }else {
                // 数字
                size *= (chs[i] -'0');
            }
        }
        // 倒叙
        for(int in=chs.length-1;in>=0;in--){
            K%=size;
            System.out.println(K + " " + size);
            // 并且为字母
            if (K==0 && Character.isLetter(chs[in])){// 长度相等
                return String.valueOf(chs[in]);
            }
            if (Character.isDigit(chs[in])){  // 是数字
                size /=(chs[in] -'0'); // 获取重复输出前字符串的长度
            }else {
                size--; // 去除字符
            }
        }
        return null;
    }

    public static void main(String[] args) {
//        String S = "y959q969u3hb22odq595";
//        int K = 222280369;
//        String S = "leet2code3";
//        int K = 34;
        String S = "a23";
        int K = 6;
        Solution solution = new Solution();
        System.out.println(solution.decodeAtIndex(S, K));
    }
}
