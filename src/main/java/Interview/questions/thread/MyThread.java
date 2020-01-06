package Interview.questions.thread;

/**
 * @Author chendm
 * @Date 2020/1/6 16:01
 * @Description
 */
public class MyThread extends Thread{

    @Override
    public void run() {

        System.out.println(super.getName()+"  start");
    }

}

