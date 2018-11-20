package Sort;

import java.util.Arrays;

/**
 * 快速排序
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/11/20
 * Time:17:01
 */
public class Quick {
    public static void sort(int[] nums, int left, int right) {
        if (left < right) {
            int i = left, j = right, x = nums[left];
            while (i < j) {
                while (i < j && nums[j] >= x)
                    j--;
                if (i < j)
                    nums[i++] = nums[j];
                while (i < j && nums[i] < x)
                    i++;
                if (i < j)
                    nums[j--] = nums[i];
            }
            nums[i] = x;
            sort(nums, left, i - 1);
            sort(nums, i + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 5, 8, 4, 7, 6, 9};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
