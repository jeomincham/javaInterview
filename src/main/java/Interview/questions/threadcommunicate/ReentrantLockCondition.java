package Interview.questions.threadcommunicate;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock和Condition的使用
 * 在使用Conditioin的await和signal时，必须将这两个方法写在ReentrantLock的lock方法之后
 */
public class ReentrantLockCondition {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        int i=1;
        for(; i<=6; i++){
            final int k = i;
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        lock.lock();
                        System.out.println("ThreadNo:A" + k + " is locked");
                        // 通过condition.await将线程阻塞
                        condition.await();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }finally{
                        lock.unlock();
                        System.out.println("ThreadNo:A"+k + " is unlocked");
                    }
                }
            });

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    if(k == 6){
                        try{
                            lock.lock();
                            System.out.println("All Threads is signaled");
                            // 通过condition.signalAll唤醒所有线程
                            condition.signalAll();
                        }catch(Exception e){
                            e.printStackTrace();
                        }finally{
                            lock.unlock();
                        }
                    }else{
                        System.out.println("threads can't signaled, wait a moment.");
                    }
                }
            });
            t1.start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t2.start();
        }
    }
}
