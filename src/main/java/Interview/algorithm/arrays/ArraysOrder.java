package Interview.algorithm.arrays;

import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author chendm
 * @Date 2020/1/5 19:12
 * @Description
 */
public class ArraysOrder {

    @Test
    /**
     * @Method test3
     * @Description
     *   数组去重排序
     *
     *   set自带去重功能
     *   TreeSet去重排序
     *
     * @param * @param
     * @Return void
     * @Date 2020/1/5 18:58
     */
    public void test1(){
        int [] nums = {1,3,4,6,4,8,5,3,2,4,0,7,8,4};
        Set<Integer> set = new TreeSet<>();  //TreeSet按自然序排列
        for (int  num : nums) {
            set.add(num);
        }
        for (Integer integer : set) {
            System.out.println("integer = " + integer);
        }
    }


    @Test
    /**
     * 先排序，再去重输出
     */
    public void test1_1() {
        int[] nums = {1, 3, 4, 6, 4, 8, 5, 3, 2, 4, 0, 7, 8, 4};
      //冒泡排序。升序
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]!=nums[i+1]){
                System.out.println(nums[i]);
            }
        }
        System.out.println(nums[nums.length-1]);
    }


}
