package newcoder.huawei.按ACSII码顺序依次输出;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author chendm
 * @Date 2020/5/10 0:26
 * @Description
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] spArrays = str.split(",");
        List<String> stringList = Arrays.asList(spArrays);
        //动态的变换List
        ArrayList<String> stringArrayList = new ArrayList<>(stringList);

        String result ="";
        int index = 0;
        int length = stringArrayList.size();
        byte max=0;

        for (int i = 0; i < length; i++) {
            max=0;
            for (int j = 0; j <stringArrayList.size() ; j++) {
                byte bt = (byte)stringArrayList.get(j).charAt(stringArrayList.get(j).length() - 1);
                if (bt>max) {
                    max=bt;
                    result=stringArrayList.get(j);
                    index=j;
                }

            }
            if (i== length-1){
                System.out.print(result);
            }else {
                System.out.print(result+",");

            }
            stringArrayList.remove(index);
        }


    }

}
