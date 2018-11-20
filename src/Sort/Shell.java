package Sort;

import java.util.Arrays;

/**
 * 希尔排序
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/11/19
 * Time:21:34
 */
public class Shell {
    public static void sort1(int[] nums) {
        int n = nums.length, gap = 0;
        int temp = 0, k = 0;
        for (gap = n / 2; gap > 0; gap /= 2) {  //步长
            for (int i = 0; i < gap; i++) {     //直接插入排序
                for (int j = i + gap; j < n; j += gap) {
                    if (nums[j] < nums[j - gap]) {
                        temp = nums[j];
                        k = j - gap;
                        while (k >= 0 && nums[k] > temp) {
                            nums[k + gap] = nums[k];
                            k -= gap;
                        }
                        nums[k + gap] = temp;
                    }
                }
            }
        }
    }

    public static void sort2(int[] nums) {
        int n = nums.length, k = 0, temp = 0;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int j = gap; j < n; j++) {
                if (nums[j] < nums[j - gap]) {
                    k = j - gap;
                    temp = nums[j];
                    while (k >= 0 && nums[k] > temp) {
                        nums[k + gap] = nums[k];
                        k -= gap;
                    }
                    nums[k + gap] = temp;
                }
            }
        }


    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 5, 8, 4, 7, 6, 9};
        sort2(a);
        System.out.println(Arrays.toString(a));
    }
}
