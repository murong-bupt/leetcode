/**
 * LeetCode_415 字符串相加（大数加法）
 *
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 *
 * 注意：
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 *
 * @author xdy
 */
public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuffer str = new StringBuffer();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (carry==1 || i>=0 || j>=0) {
            // 不减'0'则是'x' 对应的指数值 如'1'对应49
            int x = i<0 ? 0 : num1.charAt(i--) -'0';
            int y = j<0 ? 0 : num2.charAt(j--) -'0';

            str.append((x+y+carry) % 10);
            carry = (x+y+carry) / 10;
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "237495876100377530311";
        String num2 = "237495876100377530311";
        System.out.println(addStrings(num1, num2));
    }
}
