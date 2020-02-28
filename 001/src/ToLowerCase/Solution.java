package ToLowerCase;

/**
 * 709. 转换成小写字母
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 *
 */
public class Solution {
    public String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        int i=0;
        while (i<ch.length){
            if (ch[i]>='A' && ch[i]<='Z'){
                ch[i] = (char) (ch[i] + 32);
            }
            i++;
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.toLowerCase("Hello");
    }
}
