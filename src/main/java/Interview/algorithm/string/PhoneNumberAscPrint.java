package Interview.algorithm.string;

import org.junit.Test;

/**
 * @Authror chendm
 * @Date 2019/12/31 17:14
 *
 * 统计手机号各个数字个数、按照升序输出、桶排序
 *
 */
public class PhoneNumberAscPrint {


    @Test
    public void test(){
        int [] count = new int[10];
        String mobile = "15625667899";
        for (int i = 0; i < mobile.length(); i++) {
            char c = mobile.charAt(i);
            count[c-'0']++;   //c-'0'  -->'1'==49   -  ‘0’==48  将字符转为整数
        }

        for (int i = 0; i < count.length; i++) {
           if (count[i]>0){
               System.out.println(i+"出现了"+count[i]+"次");
           }
        }
    }

}
