package newcoder.swordoffer.array;

/**
 * @Author chendm
 * @Date 2020/3/12 16:08
 * @Description 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
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
                l = mid; /// 说明mid所在的位置是在第一个非递减子数组中
            } else if (array[mid] <= array[r]) {
                r = mid; /// 说明mid所在的位置是在第二个非递减子数组中
            }
        }
        return array[r];
    }
}
