package Interview.algorithm.string;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Authror chendm
 * @Date 2019/12/31 15:21
 */
public class FindDoubleString {


    //1.查找字符串中第一次重複出現的字符
    @Test
    public void test1_1() {
        //利用set的不重複性
        //     public HashSet() {
        //         map = new HashMap<>();
        //       }
        String str = "abccba";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!set.add(str.charAt(i))) {
                System.out.println(str.charAt(i));
                break;
            }

        }
    }

    @Test
    public void test1_2() {
        String str = "abccba";
        //hashSet的底層是hashMap
        Map<Character, Object> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                System.out.println(str.charAt(i));
                break;
            } else {
                map.put(str.charAt(i), 1);
            }
        }
    }


    /**
     * 2.在字符串中找出第一個只出现一次的字符
     */

    @Test
    public void test2_1() {
        String str = "abcabcdeab";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            //先看里面有没有
            Integer count = map.get(str.charAt(i));
            if (count == null) {
                count = 1;//第一次出现
            } else {

                count++;
            }
            map.put(str.charAt(i), count);
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
                break;

            }
        }

    }


    @Test
    /*
    运用java API
     */
    public void test2_2() {

        String str = "abcabcdeab";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c)==str.lastIndexOf(c)){
                System.out.println(c);
                break;
            }

        }

    }

}
