package Sort;

import java.util.Arrays;

/**
 * 插入排序
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/11/19
 * Time:21:13
 */
public class Insertion {
    public static void sort(int[] nums) {
        int n = nums.length, temp = 0;
        int j = 0;
        for (int i = 1; i < n; i++) {   //n-1此扫描，依次向前插入n-1个元素
            temp = nums[i];             //每趟将a[i]插入到前面的排序子序列中
            for (j = i - 1; j >= 0 && nums[j] > temp; j--) {
                nums[j + 1] = nums[j];  //将前面较大的元素向后移动
            }
            nums[j + 1] = temp;         //temp值到达插入位置
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 5, 8, 4, 7, 6, 9};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
