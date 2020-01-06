package Interview.questions.thread;

import org.junit.Test;

/**
 * @Author chendm
 * @Date 2020/1/6 20:27
 * @Description
 *
 * （1）sychronized:可以用来同步方法和同步代码块
 *       同步方法：给一个方法增加sychronized关键字，可以是静态方法（锁住整个类）也
 *                 可以是非静态方法（不能是抽象方法）
 *       同步代码块：通过锁定一个指定的对象，来对同步代码快进行同步。
 *     同步是高开销操作，尽量少用同步方法，同步关键代码的代码快即可。
 *
 *  （2）ReentranLock:可重入锁，代码通过lock（）方法获取锁，单必须调用unlock()方法释放锁
 */
public class SynchronizedAndReentranLock {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                int num=10;
                while(num>0){
                    num--;
                    System.out.println("this is 线程"+Thread.currentThread().getName()+":"+num);
                }
            }
        }).start();

    }


    /**
     *  未同步方法测试类
     * @throws Exception
     */
    @Test
    public void ticketTest() throws Exception {
        TicketThread.TicketThread1 ticketThread = new TicketThread().new TicketThread1();//共享同一个runnable对象
        //开启20个线程
        for (int i = 0; i <20 ; i++) {
            new Thread(ticketThread).start();
        }
        Thread.sleep(100000); //主线程休眠

    }




    /**
     *  synchronized 同步方法测试类
     * @throws Exception
     */
    @Test
    public void ticketTest1() throws Exception {
        TicketThread ticketThread = new TicketThread();//共享同一个runnable对象
        //开启20个线程
        for (int i = 0; i <20 ; i++) {
            new Thread(ticketThread).start();
        }
        Thread.sleep(100000); //主线程休眠

    }



    /**
     *  synchronized 同步代码快测试类
     * @throws Exception
     */
    @Test
    public void ticketTest2() throws Exception {
        TicketThread.TicketThread2 ticketThread = new TicketThread().new TicketThread2();//共享同一个runnable对象
        //开启20个线程
        for (int i = 0; i <20 ; i++) {
            new Thread(ticketThread).start();
        }
        Thread.sleep(100000); //主线程休眠

    }



    /**
     *  reentranLock 测试类
     * @throws Exception
     */
    @Test
    public void ticketTest3() throws Exception {
        TicketThread.TicketThread3 ticketThread = new TicketThread().new TicketThread3();//共享同一个runnable对象
        //开启20个线程
        for (int i = 0; i <20 ; i++) {
            new Thread(ticketThread).start();
        }
        Thread.sleep(100000); //主线程休眠

    }
}



