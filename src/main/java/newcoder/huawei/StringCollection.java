package newcoder.huawei;

import org.junit.Test;

import java.util.*;

/**
 * @Author chendm
 * @Date 2020/2/25 16:19
 * @Description
 * 输入一个字符串，求出该字符串包含的字符集合
 */
public class StringCollection {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){

            String strs = sc.next();
            char[] chars = strs.toCharArray();

            List<Character> list = new ArrayList<>();

            for (int i = 0; i < chars.length; i++) {

                if (!list.contains(chars[i])) {
                    list.add(chars[i]);
                }
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }


    @Test
    public  void test(){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            char[] c = in.next().toCharArray();
            StringBuffer sb = new StringBuffer();
            Set<Character> set = new HashSet<Character>();
            for(int i = 0;i<c.length;i++){
                if(set.add(c[i]))
                    sb.append(c[i]);
            }
            System.out.println(sb.toString());
        }
    }

}
