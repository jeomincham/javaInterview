package newcoder.swordoffer.others;

/**
 * @Author chendm
 * @Date 2020/3/12 21:25
 * @Description
 */
public class NumberOf1 {


    public int numberOf1(int n) {
        int sum = 0; /// ��¼1�ĸ���
        int temp = 1; /// ����������temp����ȥ�ж�n��ÿһλ�����Ƿ�Ϊ1
        while (temp != 0) { /// ��tempΪ0��ʱ��˵���Ѿ��ƶ���32�Σ�Ȼ���˵���Ѿ���������n��ÿһλ
            sum = (n & temp) != 0 ? sum + 1 : sum;
            temp = temp << 1;
        }
        return sum;
    }


}
