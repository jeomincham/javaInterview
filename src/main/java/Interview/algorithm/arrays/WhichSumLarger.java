package Interview.algorithm.arrays;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author chendm
 * @Date 2020/1/4 17:12
 * @Description 和最大的子序列
 */
public class WhichSumLarger {

    /**
     * @param * @param null
     * @Method
     * @Description 暴力破解法
     * @Return
     * @Date 2020/1/4 17:23
     */
    @Test
    public void test1() {
        int[] nums = {-1, -2, 1, 6, 1, -10};
        //输出 1,6,1
        int maxSum = nums[0];
        int step = 1;//参与求和的元素个数
        int start = 0;
        int end = 0;
        while (step <= nums.length) {
            for (int i = 0; i < nums.length - step; i++) {
                int tempsum = nums[i];
                for (int j = i + 1; j < i + step; j++) {
                    tempsum += nums[j];
                }
                if (tempsum >= maxSum) {
                    start = i;
                    end = i + step - 1;
                    maxSum = tempsum;
                }
            }
            step++;

        }
        System.out.println("maxSum = " + maxSum+";start="+start+";end="+end);
    }


    @Test
    /**
     * @Method test2
     * @Description
     *
     *   动态规划法
     * @param * @param
     * @Return void
     * @Date 2020/1/4 17:47
     */
    public void test2() {
        int[] nums = {-1, -2, 1, 6, 1, -10};
        //输出 1,6,1
        /**
         *
         * -1   以-1结尾的最大子序列
         * -2    以-2 结尾的最大子序列
         * 1,6,  以 6 结尾的最大子序列
         *  1,6,4
         *
         *  递归方法
         *
         */

        int max =nums[0];
        //sums[1] 以角标为1 的元素结尾的最大子序列的和
        int[] sums = new int[nums.length];

        sums[0]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if (sums[i-1]>0){
                sums[i]=sums[i-1]+nums[i];
            }else {
                sums[i]=nums[i];
            }

            if (sums[i]>max){
                max=sums[i];
            }
        }
//        System.out.println();
        System.out.println(max);
    }

}
