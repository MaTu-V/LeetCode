package IP;

/**
 * 1108. IP 地址无效化
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 *
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/defanging-an-ip-address
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String defangIPaddr(String address) {
        String ad = address.replace(".","[.]");
//        System.out.println(ad);
        return ad;
    }

    public static void main(String[] args) {
        String str = "255.100.50.0";
        Solution solution = new Solution();
        solution.defangIPaddr(str);
    }
}
