package Sort;

import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/11/20
 * Time:18:00
 */
public class Heap {

    public static void sort(int[] nums) {
        //构建大顶堆
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(nums, i, nums.length);
        }
        //调整堆结构+交换堆顶元素与末尾元素
        for (int j = nums.length - 1; j > 0; j--) {
            swap(nums, 0, j);//将堆顶元素与末尾元素进行交换
            adjustHeap(nums, 0, j);
        }
    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     *
     * @param nums
     * @param i
     * @param len
     */
    public static void adjustHeap(int[] nums, int i, int len) {
        //先取出当前元素i
        int temp = nums[i];

        for (int k = 2 * i + 1; k < len; k = 2 * k + 1) {//从i结点的左子结点开始，也就是2i+1处开始
            if (k + 1 < len && nums[k] < nums[k + 1]) {//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if (nums[k] > temp) {//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                nums[i] = nums[k];
                i = k;
            } else {
                break;
            }
        }
        nums[i] = temp;//将temp值放到最终的位置
    }


    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 5, 8, 4, 7, 6, 9};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

}
