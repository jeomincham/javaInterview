package Interview.designModels.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @Author chendm
 * @Date 2020/1/7 10:45
 * @Description
 */
public class SingletonTest {


    /**
     * 测试饿汉式单例模式
     */
    @Test
    public void singletonTest1() {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);  //true

    }

    @Test
    /**
     * 多线程测试饿汉式单例模式
     */
    public void test2() throws Exception {
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ":" + Singleton1.getInstance());
                }
            }).start();
        }

        Thread.sleep(10000);//设置主线程休眠时间
    }

    @Test
    /**
     *  饿汉式对于反射是不安全的
     */
    public void test3() throws Exception {
        Class singleton1Class = Singleton1.class;
        Constructor constructor = singleton1Class.getDeclaredConstructor();
        constructor.setAccessible(true);//构造方法是私有的，不能直接使用，使用setAccessible打开权限

        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 =(Singleton1) constructor.newInstance();
        System.out.println(instance1==instance2);  //false
    }



    @Test
    /**
     *  饿汉式对于序列化也是不安全的
     */
    public void test4() throws Exception {

    }
}
