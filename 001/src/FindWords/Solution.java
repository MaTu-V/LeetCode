package FindWords;

import java.util.Arrays;

/**
 * 500. 键盘行
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 *
 *
 *
 * American keyboard
 *
 *
 *
 * 示例：
 *
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *
 */
public class Solution {
    public int getIndex(char ch){
        if (ch =='q' || ch =='w' || ch =='e'  || ch =='r' || ch =='t'  || ch =='y'
        || ch == 'u' || ch=='i' || ch=='o' || ch=='p' ){
            return  0;
        }else if(ch =='a' || ch =='s' || ch =='d'  || ch =='f' || ch =='g'  || ch =='h'
                || ch == 'j' || ch=='k' || ch=='l'){
            return 1;
        }else{
            return 2;
        }
    }
    public String[] findWords(String[] words) {
        int len = 0;
        boolean[] isDel = new boolean[words.length];
        for (int i =0;i<words.length;i++){
            char[] word = words[i].toLowerCase().toCharArray();
            boolean flag = false; // 标记该单词是否被删除
            int index = getIndex(word[0]); // 第一个
            for (int j = 1;j<word.length;j++){
                if (index != getIndex(word[j])){
                    isDel[i] = true; // 标记删除
                    len++;
                    break;
                }
            }
        }
        String[] res = new String[words.length - len];
        for (int i = 0, j = 0; i < words.length; i++) {
            if (!isDel[i]) {
                res[j++] = words[i];
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    public static void main(String[] args) {
        String[] words = new String[]{
                "Hello", "Alaska", "Dad", "Peace"
        };
        Solution solution = new Solution();
        solution.findWords(words);
    }
}
