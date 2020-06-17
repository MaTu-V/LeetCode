package UncommonFromSentences;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 884. 两句话中的不常见单词
 * 给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
 * <p>
 * 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
 * <p>
 * 返回所有不常用单词的列表。
 * <p>
 * 您可以按任何顺序返回列表。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：A = "this apple is sweet", B = "this apple is sour"
 * 输出：["sweet","sour"]
 * 示例 2：
 * <p>
 * 输入：A = "apple apple", B = "banana"
 * 输出：["banana"]
 */
public class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] As = A.split(" ");
        HashMap<String,Integer> mapA = new HashMap<>();
        String[] Bs = B.split(" ");
        HashMap<String,Integer> mapB = new HashMap<>();
        HashSet<String> res = new HashSet<>();
        int[] Bc = new int[Bs.length];
        for (int i = 0;i<As.length;i++){
            if (mapA.containsKey(As[i])){
                mapA.put(As[i],mapA.get(As[i])+1);
            }else {
                mapA.put(As[i],1);
            }
        }
        for (int i = 0;i<Bs.length;i++){
            if (mapB.containsKey(Bs[i])){
                mapB.put(Bs[i],mapB.get(Bs[i])+1);
            }else {
                mapB.put(Bs[i],1);
            }
        }
        for (int i = 0;i<Bs.length;i++){
            if (mapA.containsKey(Bs[i])){
                mapA.remove(Bs[i]);
            }
        }
        for (int i = 0;i<As.length;i++){
            if (mapB.containsKey(As[i])){
                mapB.remove(As[i]);
            }
        }
        for (String s:mapA.keySet()){
            if (mapA.get(s) <= 1){
                res.add(s);
            }
        }
        for (String s:mapB.keySet()){
            if (mapB.get(s) <= 1){
                res.add(s);
            }
        }
        System.out.println(res);
        return  res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
        String A = "xfj vcahm vcahm frkqt oibcc jko oibcc frkqt ft tr";
        String B = "lv ktx ktx tr x xfj xfj frkqt ktx ta tr yynk vcahm";
        Solution solution = new Solution();
        solution.uncommonFromSentences(A, B);
    }
}
