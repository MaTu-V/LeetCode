package CheckPermutation;

/**
 * 面试题 01.02. 判定是否互为字符重排
 *
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 */
public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() !=s2.length()){
            return  false;
        }
        int[] t1 = new int[26];
        int[] t2 = new int[26];
        for (int i = 0;i<s1.length();i++){
            t1[s1.charAt(i) - 'a']++;
            t2[s2.charAt(i) - 'a']++;
        }
        boolean flag= true;
        for (int i =0;i<26;i++){
            if (t1[i] != t2[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String s1 = "asvnpzurz";
        String s2 = "urzsapzvn";

        Solution solution = new Solution();
        System.out.println(solution.CheckPermutation(s1,s2));
    }
}
