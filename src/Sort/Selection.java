package Sort;

import java.util.Arrays;

/**
 * 选择排序
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/11/19
 * Time:20:44
 */
public class Selection {

    public static void sort(int[] nums) {
        int n = nums.length;
        int t = 0;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            t = nums[i];
            nums[i] = nums[min];
            nums[min] = t;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 5, 8, 4, 7, 6, 9};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
