package Interview.algorithm.string;

import org.junit.Test;

/**
 * @Authr chendm
 * @Date 2020/1/1 22:04
 *
 * 输入一个字符串和字节数，输出按字节截取字符串，但是要保证汉字不能被截半个
 * 例如“人ABC” 4 ，应该截取为“人AB”,输入“人ABC们DEF” 6 ,应该截取为“人ABC”，而不是“人ABC+们的半个”
 *
 * 汉字有时当作2个字节，汉字占三个字节
 */
public class StringSplit {


    //获取一个字符所占字节数

    @Test
    public void test(){
        String str= "人ABC们DEF";
        int count = 7;
        int sum = 0;//已经截取了多少
        StringBuilder stringBuilder = new StringBuilder();
        //StringBuilder类也代表可变字符串对象。实际上，StringBuilder和StringBuffer基本相似，
        // 两个类的构造器和方法也基本相同。不同的是：StringBuffer是线程安全的(StringBuffer类中的方法都添加了synchronized关键字，
        // 也就是给这个方法添加了一个锁，用来保证线程安全。)，
        // 而StringBuilder则没有实现线程安全功能，所以性能略高。

        for (int i = 0; i < str.length(); i++) {
            int len = String.valueOf(str.charAt(i)).getBytes().length;//把“char  '人'  先转换为字符串，然后获取字节数得到字节长度”
            if (sum+len <= count) {
                sum+=len;
                stringBuilder.append(str.charAt(i));
            }else {
                break;
            }
        }
        System.out.println(stringBuilder);
    }

}
