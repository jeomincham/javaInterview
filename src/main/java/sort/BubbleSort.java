package sort;

/**
 * @Author chendm
 * @Date 2020/2/29 21:39
 * @Description
 */
public class BubbleSort {


    public static void main(String[] args) {
        int[] array = {6, 5, 9, 1, 2, 4};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] arrays) {

        if (arrays == null || arrays.length==0) {
            return;
        }
        
        
        int temp;
        //第一个for循环：i < num.length-1;目的是为了让实现排序的趟数比数组长度少1，
        // 比如上面6个元素的数组，只需要排序5次

        for (int i = 0; i < arrays.length - 1; i++) {
            //第二个for循环：表示每一趟排序中，相邻两个数的比较，
            // j < num.length-1-i;这个减少i是什么意思呢减i是为了实现，
            // 每多一趟排序，则相邻的两个数比较次数减少一次，而i又是从0开始的
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }


                for (int a : arrays) {
                    System.out.print(a + " ");
                }
                System.out.println("内循环每次打印 i===" + i + ",j=" + j);
            }
            System.out.println("外循环分割符");
        }
        for (int a : arrays) {
            System.out.print(a + " ");
        }
    }

}
