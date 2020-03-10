package sort;

import utils.PrintArrayUtil;

/**
 * @Author chendm
 * @Date 2020/3/2 9:43
 * @Description
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {6, 5, 9, 1, 2, 4};
        shellSort(array);
        PrintArrayUtil.print(array);
    }


    public static void shellSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int incre = array.length / 2;
        while (incre >= 1) {
            shellInsert(array, incre);
            incre /= 2;
        }
    }


    public static void shellInsert(int[] array, int incre) {
        int target, j;
        for (int i = incre; i < array.length; i++) {
            j = i - incre;
            target = array[i];
            while (j >= 0 && array[j] > target) {
                array[j + incre] = array[j];
                j -= incre;
            }
            if (j != i - incre) {
                array[j + incre] = target;
                PrintArrayUtil.print(array);
            }
        }
    }


    public static void shellInsert2(int[] array, int incre) {
        int temp;

        for (int k = 0; k < incre; k++) {    //根据增量分为若干子序列

            for (int i = k + incre; i < array.length; i += incre) {

                for (int j = i; j > k; j -= incre) {
                    if (array[j] < array[j - incre]) {
                        temp = array[j - incre];
                        array[j - incre] = array[j];
                        array[j] = temp;
                        PrintArrayUtil.print(array);
                    }
                }
            }
        }
    }
}
