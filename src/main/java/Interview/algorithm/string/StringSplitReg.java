package Interview.algorithm.string;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Authr chendm
 * @Date 2020/1/2 13:02
 *
 * 从以下代码中截取efg的代码   <p id="test">abcdefg</>
 *
 * 1.截取 substring();
 * 2.正则表达式;
 */
public class StringSplitReg {


    @Test
    public void test1_1(){
        String str = "<p id=\"test\">abcdefg</p>";
        String reg= "efg";
        int index = str.indexOf(reg);//第一次出现的位置
        String target = str.substring(index,index+reg.length());  // [start ,end)
        System.out.println(target);
    }

    @Test
    public void test1_2(){
        String str = "<p id=\"test\">abcdefg</>";
        String reg= "(.*)(efg)(.*)";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));

        }
    }

}
