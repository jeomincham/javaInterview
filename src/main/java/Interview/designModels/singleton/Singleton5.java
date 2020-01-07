package Interview.designModels.singleton;

/**
 * @Author chendm
 * @Date 2020/1/7 16:12
 * @Description 线程同步的懒汉式synchronized 或同步代码块，，，效率低
 */
public class Singleton5 {

    //2.当前类的实例属性
    private static Singleton5 instance = null; //静态的实例属性，


    //1,私有化构造器，对象不能通过外界的构造方法实现
    private Singleton5() {

    }

    //3.对外提供获取当前对象的方法
    public static synchronized Singleton5 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton5();
        }
        return instance;
    }

}
