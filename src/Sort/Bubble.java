package Sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/11/19
 * Time:20:53
 */
public class Bubble {
    public static void sort(int[] nums) {
        int n = nums.length, t = 0;
        boolean flag = true;
        for (int i = 0; i < n && flag; i++) {
            flag = false;
            for (int j = i; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    t = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = t;
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 5, 8, 4, 7, 6, 9};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
