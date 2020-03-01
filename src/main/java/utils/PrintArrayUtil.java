package utils;

/**
 * @Author chendm
 * @Date 2020/3/1 0:00
 * @Description
 */
public class PrintArrayUtil<T> {

    //引用型
    public static <T> void print(T[] t){
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+" ");
        }
        System.out.println();
    }

    //基本型
    public static void print(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+" ");
        }
        System.out.println();
    }
}
