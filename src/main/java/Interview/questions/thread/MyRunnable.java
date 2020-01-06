package Interview.questions.thread;

/**
 * @Author chendm
 * @Date 2020/1/6 16:08
 * @Description
 */
public class MyRunnable implements Runnable{
    private int num = 10;
    @Override
    public void run() {
        num--;
        System.out.println(Thread.currentThread().getName()+";"+num);


    }
}
