package sort;

import utils.PrintArrayUtil;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author chendm
 * @Date 2020/3/1 21:32
 * @Description
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {6, 5, 9, 1, 2, 4};
        System.out.println(Arrays.toString(array));

        insertionSort(array);

    }



    public static void insertionSort(int [] array){

        int temp;//定义两数交换用的零时变量

        //外循环的次数为数组的长度减1
        for (int i = 0; i < array.length-1; i++) {
            //从array[1]，即第二个元素开始比较，比较次数逐渐增多
            for (int j = i+1; j >0; j--) {
                if (array[j]<array[j-1]) {
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
                else{
                    continue;  //不需要交换
                }
            }
            PrintArrayUtil.print(array);
        }
    }
}
