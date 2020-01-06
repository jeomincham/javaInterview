package Interview.questions.thread;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @Author chendm
 * @Date 2020/1/6 16:04
 * @Description
 */
public class ThreadTest {

    @Test
    public void testMythread() throws Exception {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
        Thread.sleep(1000);

    }


    @Test
    public void testMyRunnable() throws Exception {
        //Runnable可以进行变量的共享
       //同一个Runnable,不同的Thread，共享runnable定义的变量
        MyRunnable myRunnable1= new MyRunnable();
        //   MyRunnable myRunnable2 = new MyRunnable();
        new Thread(myRunnable1).start();
        new Thread(myRunnable1).start();
        //Thread-0;9
        //Thread-1;8
        Thread.sleep(1000);

    }



    @Test
    public void testMyRunnable2() throws Exception {

        MyRunnable myRunnable1= new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();
        new Thread(myRunnable1).start();
        new Thread(myRunnable2).start();
        //Thread-0;9
        //Thread-1;9
        Thread.sleep(1000);

    }



    @Test
    public void testMyCallable()throws Exception{
        Callable<Integer> callable = new MyCallable();
        FutureTask<Integer> futureTask1 = new FutureTask<>(callable);
        FutureTask<Integer> futureTask2 = new FutureTask<>(callable);

        new Thread(futureTask1).start();
        new Thread(futureTask2).start();


        Integer integer1 = futureTask1.get();
        Integer integer2 = futureTask2.get();

        System.out.println(integer1);
        System.out.println(integer2);

    }


    /**
     * 线程池Executors测试
     * @throws Exception
     */
    @Test
    public void testThreadPool() throws Exception{
        ExecutorService pool = Executors.newFixedThreadPool(9);
        MyRunnable myRunnable = new MyRunnable();
        pool.submit(myRunnable);
        pool.submit(myRunnable);
        pool.submit(myRunnable);
        pool.submit(myRunnable);
        pool.submit(myRunnable);
        pool.submit(myRunnable);
        pool.submit(myRunnable);
        pool.submit(myRunnable);

        Thread.sleep(1000);
        pool.shutdown();

    }
}
