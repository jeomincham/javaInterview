package Interview.designModels.singleton;

import org.junit.Test;

/**
 * @Author chendm
 * @Date 2020/1/7 16:02
 * @Description
 */
public class Sinleton4Test {


    @Test
    /**
     * 单线程安全
     */
    public void test(){
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1==instance2);
    }


    @Test
    /**
     *    多线程不安全
     */
    public void test2() throws Exception {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"::"+Singleton5.getInstance());
                }
            }).start();

        }
//        System.in.read();
        Thread.sleep(9000);
    }


}
