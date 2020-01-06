package Interview.questions.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author chendm
 * @Date 2020/1/6 20:59
 * @Description
 */
public class TicketThread implements Runnable {
    private int num = 10;

    @Override
    public synchronized void run() {  //synchronized是阻塞状态
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        if (num >= 1) {

            try {
                Thread.sleep(1000); //模拟线程冲突
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num--;
            System.out.println(Thread.currentThread().getName() + ";" + num);
        } else {
            System.out.println(Thread.currentThread().getName() + ";" + "票已卖完");
        }

    }


    /**
     * 未同步的代码类
     */
    class TicketThread1 implements Runnable {
        private int num = 10;

        @Override
        public void run() {
            if (num >= 1) {
                try {
                    Thread.sleep(1000); //模拟线程冲突
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num--;
                System.out.println(Thread.currentThread().getName() + ";" + num);
            } else {
                System.out.println(Thread.currentThread().getName() + ";" + "票已卖完");
            }

        }


    }


    /**
     * synchronized同步代码快类
     */
    class TicketThread2 implements Runnable {
        private int num = 10;

        @Override
        public void run() {

            synchronized (this) {
                if (num >= 1) {

                    try {
                        Thread.sleep(1000); //模拟线程冲突
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num--;
                    System.out.println(Thread.currentThread().getName() + ";" + num);
                } else {
                    System.out.println(Thread.currentThread().getName() + ";" + "票已卖完");
                }
            }
        }

    }


    /**
     * reentranLock 卖票线程模拟类
     */
    class TicketThread3 implements Runnable {
        private int num = 10;

        ReentrantLock lock = new ReentrantLock();

        @Override
        public void run() {
            lock.lock();
            try {
                if (num >= 1) {
                    try {
                        Thread.sleep(1000); //模拟线程冲突
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num--;
                    System.out.println(Thread.currentThread().getName() + ";" + num);
                } else {
                    System.out.println(Thread.currentThread().getName() + ";" + "票已卖完");
                }
            } finally {
                lock.unlock();
            }

        }
    }
}
