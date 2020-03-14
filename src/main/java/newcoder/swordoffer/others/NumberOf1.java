package newcoder.swordoffer.others;

/**
 * @Author chendm
 * @Date 2020/3/12 21:25
 * @Description
 */
public class NumberOf1 {


    public int numberOf1(int n) {
        int sum = 0; /// 记录1的个数
        int temp = 1; /// 本质上是用temp变量去判断n的每一位数字是否为1
        while (temp != 0) { /// 当temp为0的时候，说明已经移动了32次，然后就说明已经遍历完了n的每一位
            sum = (n & temp) != 0 ? sum + 1 : sum;
            temp = temp << 1;
        }
        return sum;
    }


}
