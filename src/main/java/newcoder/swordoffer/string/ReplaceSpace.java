package newcoder.swordoffer.string;

/**
 * @Author chendm
 * @Date 2020/3/11 22:10
 * @Description
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，
 * 当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(str));

    }

    public static String replaceSpace(StringBuffer str) {

        String res = "%20";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                stringBuilder.append(res);
            }else {
                stringBuilder.append(str.charAt(i));
            }
        }

        return stringBuilder.toString();

    }
}
