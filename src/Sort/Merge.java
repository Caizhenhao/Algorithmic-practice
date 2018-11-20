package Sort;

import java.util.Arrays;

/**
 * 归并排序
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/11/19
 * Time:21:53
 */
public class Merge {
    public static void mergeSort(int[] nums, int start, int end) {
        //使用递归的方式进行归并排序，所需要的空间复杂度是O（N+logN）
        if (start < end) {
            int mid = (start + end) / 2;
            //递归地对左右两边进行排序
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            //合并
            merge(nums, start, mid, end);
        }
    }

    //merge函数实际上是将两个有序数组合并成一个有序数组
    //因为数组有序，合并很简单，只要维护几个指针就可以了
    private static void merge(int[] nums, int start, int mid, int end) {
        //temp数组用于暂存合并的结果
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        //将记录由小到大地放进temp数组
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j])
                temp[k++] = nums[i++];
            else
                temp[k++] = nums[j++];
        }

        //接下来两个while循环是为了将剩余的（比另一边多出来的个数）放到temp数组中
        while (i <= mid)
            temp[k++] = nums[i++];
        while (j <= end)
            temp[k++] = nums[j++];

        //将temp数组中的元素写入到待排数组中
        for (int p = 0; p < k; p++)
            nums[start + p] = temp[p];
    }

    public static void mergeSort2(int[] nums) {
        //使用非递归的方式来实现归并排序
        int n = nums.length;
        int k = 1;

        while (k < n) {
            MergePass(nums, k, n);
            k *= 2;
        }
    }

    //MergePass方法负责将数组中的相邻的有k个元素的序列进行归并
    private static void MergePass(int[] nums, int k, int n) {
        int i = 0;

        //从前往后,将2个长度为k的子序列合并为1个
        while (i < n - 2 * k + 1) {
            merge(nums, i, i + k - 1, i + 2 * k - 1);
            i += 2 * k;
        }

        //这段代码保证了，将那些“落单的”长度不足两两merge的部分和前面merge起来。
        if (i < n - k) {
            merge(nums, i, i + k - 1, n - 1);
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 5, 8, 4, 7, 6, 9};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
