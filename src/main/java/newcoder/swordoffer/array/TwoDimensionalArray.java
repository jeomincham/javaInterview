package newcoder.swordoffer.array;
/**
 * 二维数组的查找
 */

/**
 * @Author chendm
 * @Date 2020/2/29 11:35
 * @Description 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class TwoDimensionalArray {

    public static void main(String[] args) {
        //定义二维数组
        int[][] arrs = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean result = Find(9, arrs);
        System.out.println(result);

    }

    public static boolean Find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }

            }
        }
        return false;
    }


    public static boolean Find2(int target, int[][] array) {
    /*
        思路：
        根据数组的特点可以发现,如果从左下角开始查找更为方便
        左下角的数比同一列的数大，同时比同一行的数小
        也就是从左下角开始比，如果target传入的数大于它则列数加一继续比较
        如果小于它则行数减一继续比较
        */
        //定义行数
        int rows = array.length;
        //定义列数
        int lies = array[0].length;
        //定义i用来技计数
        int i = 0;
        //while里的条件是极限情况，不满足条件的时候则停止
        while ((rows > 0) && (i < lies)) {
            //目标大于左下角，让列数自增
            if (target > array[rows - 1][i]) {
                i++;
                //目标小于左下角，让行数自减
            } else if (target < array[rows - 1][i]) {
                rows--;
            } else {
                //除了上述两种情况就是相等了，说明已经找到了
                return true;
            }
        }
        //遍历完还没有找到，说明不存在
        return false;
    }

}
