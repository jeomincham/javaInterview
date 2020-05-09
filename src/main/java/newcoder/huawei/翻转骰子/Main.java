package newcoder.huawei.·­×ª÷»×Ó;

import java.util.Arrays;

/**
 * @Author chendm
 * @Date 2020/5/10 0:13
 * @Description
 */
public class Main{
        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
            test2("L");
        }

        public static void test2(String str) {
            int[] init = {1, 2, 3, 4, 5, 6};
            for (int i = 0; i < str.length(); i++) {

                switch (str.charAt(i)) {
                    case 'L':
                        int tem = init[0];
                        init[0] = init[4];
                        init[4] = init[1];
                        init[1] = init[5];
                        init[5] = tem;
                        continue;

                    case 'R':
                        int tem1 = init[0];
                        init[0] = init[5];
                        init[5] = init[1];
                        init[1] = init[4];
                        init[4] = tem1;
                        continue;

                    case 'F':
                        int tem2 = init[2];
                        init[2] = init[4];
                        init[4] = init[3];
                        init[3] = init[5];
                        init[5] = tem2;
                        continue;

                    case 'B':
                        int tem3 = init[2];
                        init[2] = init[5];
                        init[5] = init[3];
                        init[3] = init[4];
                        init[4] = tem3;
                        continue;

                    case 'A':
                        int tem4 = init[0];
                        init[0] = init[3];
                        init[3] = init[1];
                        init[1] = init[2];
                        init[2] = tem4;
                        continue;

                    case 'C':
                        int tem5 = init[0];
                        init[0] = init[2];
                        init[2] = init[1];
                        init[1] = init[3];
                        init[3] = tem5;
                        continue;
                    default:
                        break;

                }


            }
            String result = Arrays.toString(init);
            System.out.println(result);
        }
}
