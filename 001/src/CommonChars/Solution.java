package CommonChars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1002. 查找常用字符
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 *
 * 你可以按任意顺序返回答案。
 *
 *
 *
 * 示例 1：
 *
 * 输入：["bella","label","roller"]
 * 输出：["e","l","l"]
 * 示例 2：
 *
 * 输入：["cool","lock","cook"]
 * 输出：["c","o"]
 *
 */
public class Solution {
    public List<String> commonChars(String[] A) {
        int[] nums1 = new int[26];
        for (int i=0;i<A[0].length();i++){
            nums1[A[0].charAt(i) -'a']++;
        }

        for (int i=1;i<A.length;i++){
            int[] cur = new int[26];
            for (char ch:A[i].toCharArray()){
                int idx = ch-'a';
                cur[idx]++;
            }
            for (int j = 0; j < 26; j++) {
                if(cur[j] < nums1[j])
                    nums1[j] = cur[j]; // 统计最小出现次数
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0;i<nums1.length;i++){
            while (nums1[i]-->0){
                list.add((char)('a'+ i) + "");
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String[] A = new String[]{"bella","label","roller"};
        Solution solution = new Solution();
        solution.commonChars(A);
    }
}
