package Interview.questions.threadcommunicate;

import java.util.concurrent.CountDownLatch;

/**
 * 闭锁的使用
 * 闭锁用于等待事件，当闭锁到达结束状态（本例中是闭锁的计数器值减为0）之前，所有线程都等待，当闭锁到达结束状态时，所有线程都通过
 * 闭锁是一次性的，当闭锁到达结束状态后，将不会被重置，这个锁会永远打开并允许所有线程通过。
 * 可以将代码中的NUM变量值变为2和4，分别试试什么效果
 */
public class CountDownLatchThread {
    public static void main(String[] args) {
        // 定义闭锁，并设置闭锁的计数器值为3
        CountDownLatch lock = new CountDownLatch(3);
        // 循环定义3个线程
        int NUM = 3;
        for(int i=1; i<=NUM; i++){
            final int k = i;
            Thread a = new Thread(new Runnable(){
                @Override
                public void run(){
                    try{
                        Thread.sleep(k * 1000);
                        System.out.println("ThreadNo:A"+k);
                        // 每个线程在休眠指定时间后将闭锁的计数器值减1，当闭锁的计数器值减到0时，闭所将被打开，从而使第二个循环中的所有线程才能通过
                        lock.countDown();
                        // 打印闭锁计数器的值
                        System.out.println("ThreadNo:A"+k+"; getCount:"+lock.getCount());
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
            a.start();
        }
        // 循环定义2个线程
        for(int i=1; i<=2; i++){
            final int k = i;
            Thread b = new Thread(new Runnable(){
                @Override
                public void run(){
                    try{
                        System.out.println("ThreadNo:B"+k+" is waiting...");
                        // 当闭锁的计数器值不为0时，线程将在此处被中断
                        lock.await();
                        // 当闭锁的计数器值等于0时，闭锁将被打开，所有等待的线程都将被唤醒
                        System.out.println("ThreadNo:B"+k+" is notify");
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
            b.start();
        }
    }

}
