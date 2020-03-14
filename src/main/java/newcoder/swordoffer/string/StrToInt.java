package newcoder.swordoffer.string;

/**
 * @Author chendm
 * @Date 2020/3/11 22:58
 * @Description 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 */


public class StrToInt {

    public static void main(String[] args) {
        String str = "567";
        int toInt = StrToInt(str);
        System.out.println(toInt);
    }


    public static int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        boolean isNegative = str.charAt(0) == '-';
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && (c == '+' || c == '-')) {
                continue;
            }
            if (c < '0' || c > '9') {
                return 0;
            }
            ret = ret * 10 + (c - '0');
        }
        ret = isNegative ? -ret : ret;
        if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) {
            return 0;
        }
        return  ret;
    }

}
