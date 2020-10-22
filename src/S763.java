import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName S763
 * @Description 划分字母区间
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
 * <p>
 * 输入：S = "ababcbacadefegdehijhklij"
 * 输出：[9,7,8]
 * 解释：
 * 划分结果为 "ababcbaca", "defegde", "hijhklij"。
 * 每个字母最多出现在一个片段中。
 * 像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
 * @Author xdy
 * @Date 2020/10/22 7:53 下午
 */
public class S763 {
    /**
     * 暴力解法
     */
    public static List<Integer> partitionLabels(String s) {
        String[] stringArray = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            stringArray[i] = String.valueOf(s.charAt(i));
        }
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (stringArray[j].contains(stringArray[i])) {
                    for (int k = j; k < i; k++) {
                        stringArray[k + 1] = stringArray[k] + stringArray[k + 1];
                        stringArray[k] = "";
                    }
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (stringArray[i].length() > 0) {
                result.add(stringArray[i].length());
            }
        }
        return result;
    }

    /**
     * 贪心+双指针
     */
    public static List<Integer> solution(String s) {
        return null;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> result = partitionLabels(s);
        System.out.println(result);
    }
}
