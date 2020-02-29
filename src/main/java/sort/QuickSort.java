package sort;

import utils.PrintArrayUtil;

/**
 * @Author chendm
 * @Date 2020/2/29 23:39
 * @Description
 */
public class QuickSort {

    public static void main(String[] args) {
        int [] array = {6, 5, 9, 1, 2, 4};
        int [] array2 = {49,38,65,97,76,13,27,49};
        sort(array2);
        PrintArrayUtil.print(array2);
    }

    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }


    public static void quickSort(int[] array, int left, int right) {

        if (left >= right) {
            return;
        }

        int partition = partition(array, left, right);
        quickSort(array, left, partition - 1);
        quickSort(array, partition + 1, right);

    }

//1.先找出枢轴的位置
    public static int partition(int[] array, int left, int right) {
        //1.1 将数组的第一个（左边）的数做枢轴记录
        int pavotkey = array[left];

        //1.2 从数组的两段交替向中间扫描
        while (left < right) {
            //1.3 当右边的值比枢轴值大时，向中间移动右边的位数为1
            while (left < right && array[right] >= pavotkey) {
                right--;
            }
            //1.4 将比枢轴记录小的右边值移到左端的标记位
            array[left] = array[right];

            while (left < right && array[left] <= pavotkey) {
                left++;
            }
            array[right] = array[left];

        }
        //将枢轴数 移动到数组的对应位置
        array[left] = pavotkey;

        //返回枢轴在数组的位置
        return left;

    }
}
