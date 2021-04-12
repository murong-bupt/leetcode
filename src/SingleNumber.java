/**
 * LeetCode_136 只出现一次的数字
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：算法应该具有线性时间复杂度，且不使用额外空间来实现。
 *
 * @author xdy
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i=0; i<nums.length; i++) {
            // 做异或运算，相同的两两抵消
            result = result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(singleNumber(arr));
    }

}
