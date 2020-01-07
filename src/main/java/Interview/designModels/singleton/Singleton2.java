package Interview.designModels.singleton;

/**
 * @Author chendm
 * @Date 2020/1/7 11:49
 * @Description 登记式 与饿汉式 初始化对象的时机不一样。线程安全、防止反射攻击、反序列化不安全
 *
 */
public class Singleton2 {
    //在静态内部内里面，当我们调用getInstance（）方法时，才会触发当前内部类的加载，也就是说当我们用
    // Singleton2这个对象的其他静态方法时候是不会触发SingletonHodler的加载

    //2,静态内部类，申明全局属性
    private static class SingletonHodler{
        private static Singleton2 instance = new Singleton2();

    }

    //1,私有化构造器，对象不能通过外界的构造方法实现
    private Singleton2(){
        System.out.println("Singleton2构造方法");


        if (SingletonHodler.instance!=null){
            throw new IllegalStateException();
        }
    }

    //3.对外提供getInstance()方法
    public static Singleton2 getInstance(){
        return SingletonHodler.instance;
    }
}
