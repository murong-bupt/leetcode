package jianzhioffer;

/**
 * 找出数组中重复的数字
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
 * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 * @author : xdy
 * @date : 2021-04-09 23:31
 **/
public class J1 {
    /**
     * 基础解法
     */
    public static int findRepeatNumber(int[] nums) {
        int[] a = new int[nums.length];
        for (int num : nums) {
            a[num]++;
            if (a[num] > 1) {
                return num;
            }
        }
        return -1;
    }

    /**
     * 原地置换
     */
    public static int findRepeatNumber2(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; ++i) {
            while (nums[i] != i) {
                //发现重复元素
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                //置换，将指针下的元素换到属于他的索引处
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
        System.out.println(findRepeatNumber2(nums));
    }
}
