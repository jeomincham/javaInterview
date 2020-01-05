package Interview.algorithm.string;

import org.junit.Test;

/**
 * @Author chendm
 * @Date 2020/1/4 16:20
 * @Description 判断字符串是否合法的ipv4地址
 */
public class IsIpv4 {


    @Test
    public void test() {
        String ip = "02.66.68.234";
        boolean checkIp = checkIp(ip);
        System.out.println("checkIp = " + checkIp);
    }


    public boolean checkIp(String ip) {
        String[] arrs = ip.split("\\."); //要对“.”进行转义
        if (arrs.length != 4) {
            return false;
        }

        for (String arr : arrs) {
            try {
                Integer num = Integer.parseInt(arr);
                if (num > 255 || num < 0) {
                    return false;
                }

                if (!arr.equals("0") && arr.startsWith("0")) {//避免01出现
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
