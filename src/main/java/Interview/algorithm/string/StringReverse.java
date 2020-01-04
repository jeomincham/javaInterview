package Interview.algorithm.string;

import org.junit.Test;

/**
 * @Author chendm
 * @Date 2020/1/2 21:22
 * @Description 字符串反转 首位互相调转
 *
 */
public class StringReverse {


    @Test
    /**
     * @Method test1_1
     * @Author Administrator
     * @Version  1.0
     * @Description 利用工具类反转字符串
     * @param * @param
     * @Return void
     * @Date 2020/1/2 21:23
     */
    public void test1_1(){
        String str= "abddefg";
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println("reverse = " + reverse);

    }

    @Test
    /**
     * @Method test1_2
     * @Author Administrator
     * @Version  1.0
     * @Description  字符串的倒序遍历拼接
     * @param * @param
     * @Return void
     * @Date 2020/1/2 21:26
     */
    public void test1_2(){
        String str= "abddefg";
        String des ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            des+=str.charAt(i);
        }
        System.out.println(des);
    }


    @Test
    /**
     * @Method test1_3
     * @Author Administrator
     * @Version  1.0
     * @Description  利用char数组首尾对应进行互换
     * @param * @param
     * @Return void
     * @Date 2020/1/2 21:32
     */
   public void test1_3(){
        String str= "abddefg";
        char[] chars = str.toCharArray();//将字符串转换为字符数组
        for (int i = 0; i < chars.length/2; i++) {
            char temp = chars[i];//定义一个零时变量储存第i个字符
            chars[i]=chars[chars.length-1-i]; //第i个位置的元素被末位对应位置的元素替换
            chars[chars.length-1-i]=temp;
        }

        System.out.println(String.valueOf(chars));  //char数组转换为string

        System.out.println(new String(chars)); //char数组转换为string

    }

    /**
     *
     * @Description
     *  输入“I Love The Game”，输出“Game The Love I”
     *
     * @Date 2020/1/2 21:44
     */


    @Test
    public void test2_1(){

        String str = "I Love The Game";
        String inverseSentence = inverseSentence(str, " ");
        System.out.println("inverseSentence = " + inverseSentence);

    }


    String inverseSentence(String in,String sep){
        String[] arrs = in.split(sep);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =arrs.length-1 ; i >= 0; i--) {
           stringBuilder.append(arrs[i]);
           stringBuilder.append(sep);
        }

//        return stringBuilder.toString();
        return stringBuilder.substring(0,stringBuilder.length()-sep.length());
                            //要去掉最后面的空格，substring  [ ，）

    }

}
