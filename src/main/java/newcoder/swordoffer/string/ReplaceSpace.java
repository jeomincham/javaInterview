package newcoder.swordoffer.string;

/**
 * @Author chendm
 * @Date 2020/3/11 22:10
 * @Description
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬
 * ���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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
