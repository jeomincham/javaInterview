package Interview.questions.threadcommunicate;

/**
 * wait和notify的使用
 * wait和notify必须应用在synchronized块或方法内
 * 下面的代码向跳交谊舞一样互相控制着对方的输出
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread a = new Thread(new Runnable(){
            @Override
            public void run(){
                synchronized (lock){
                    try{
                        lock.wait();
                        System.out.println("A-1");
                        lock.notify();
                        lock.wait();
                        System.out.println("A-2");
                        lock.notify();
                        lock.wait();
                        System.out.println("A-3");
                        lock.notify();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread b = new Thread(new Runnable(){
            @Override
            public void run(){
                synchronized (lock){
                    try{
                        System.out.println("B-1");
                        lock.notify();
                        lock.wait();
                        System.out.println("B-2");
                        lock.notify();
                        lock.wait();
                        System.out.println("B-3");
                        lock.notify();
                        lock.wait();
                        System.out.println("B-4");
                    }catch(InterruptedException e){
                        e.printStackTrace();;
                    }
                }
            }
        });
        a.start();
        b.start();
    }
}
