package Interview.questions.thread;

import java.util.concurrent.Callable;

/**
 * @Author chendm
 * @Date 2020/1/6 16:40
 * @Description
 */
public class MyCallable implements Callable {

    private int num = 10;
    @Override
    public Object call() throws Exception {
        num--;
        System.out.println(Thread.currentThread().getName()+":"+num);
        return num;
    }
}
