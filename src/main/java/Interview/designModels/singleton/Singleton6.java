package Interview.designModels.singleton;

/**
 * @Author chendm
 * @Date 2020/1/7 16:21
 * @Description 懒汉式--双检锁
 */
public class Singleton6 {
    //2.当前类的实例属性
    private static Singleton6 instance = null; //静态的实例属性，


    //1,私有化构造器，对象不能通过外界的构造方法实现
    private Singleton6() {

    }

    //3.对外提供获取当前对象的方法
    public static Singleton6 getInstance() {

        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }

}
