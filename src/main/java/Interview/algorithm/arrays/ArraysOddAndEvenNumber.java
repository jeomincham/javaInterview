package Interview.algorithm.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author chendm
 * @Date 2020/1/5 21:12
 * @Description
 */
public class ArraysOddAndEvenNumber {
/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 是所有的奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */

@Test
    public void test(){
    Integer [] num = {7,6,5,4,8,9,1,2,4,5};

    /**
     *  定义数组需要确定数组得大小
     *
     *  而list则可以对数据数量不固定的数组进行存储和操作
     */
    ArrayList<Integer> oddNumber = new ArrayList<>(); //存奇数
    ArrayList<Integer> evenNumber = new ArrayList<>(); //存偶数

    for (int i = 0; i < num.length; i++) {
        if (num[i]%2==0){
            evenNumber.add(num[i]);
        }else {
            oddNumber.add(num[i]);
        }

    }
    oddNumber.addAll(evenNumber);
    oddNumber.toArray(num);  //数组替换为
    System.out.println(Arrays.toString(num)); //数组转换为String

}




}
