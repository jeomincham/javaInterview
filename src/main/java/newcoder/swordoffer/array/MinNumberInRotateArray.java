package newcoder.swordoffer.array;

/**
 * @Author chendm
 * @Date 2020/3/12 16:08
 * @Description ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class MinNumberInRotateArray {
    public static void main(String[] args) {

        int[] array = {3, 4, 5, 1, 2};

        int i = minNumberInRotateArray2(array);
        System.out.println(i);
    }

    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int ans = array[0];
        for (int i = 1; i < array.length; i++) {
            ans = Math.min(ans, array[i]);
        }
        return ans;
    }



    public static int minNumberInRotateArray2(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int l = 0;
        int r = array.length - 1;
        while (l < r - 1) {
            int mid = (l + r) >> 1;
            if (array[mid] >= array[l]) {
                l = mid; /// ˵��mid���ڵ�λ�����ڵ�һ���ǵݼ���������
            } else if (array[mid] <= array[r]) {
                r = mid; /// ˵��mid���ڵ�λ�����ڵڶ����ǵݼ���������
            }
        }
        return array[r];
    }
}
