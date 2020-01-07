package Interview.designModels.singleton;

/**
 * @Author chendm
 * @Date 2020/1/7 10:38
 * @Description
 *
 * 饿汉式单例模式
 *  1.线程安全
 *  2.序列化不安全。解决办法：readResolve()方法
 *  3.反射不安全。
 */
public class Singleton1 {
    //2.当前类的实例属性
    private static Singleton1 instance = new Singleton1(); //静态的实例属性，
                                                            // 静态属性是全局的，无论类当前有多少个对象，永远共享同一个属性

    //1,私有化构造器，对象不能通过外界的构造方法实现
    private Singleton1(){

    }

    //3.对外提供获取当前对象的方法
    public static Singleton1 getInstance(){;
      return instance ;
    }




//    public final class MySingleton implements Serializable{  实现Serializable序列化接口
//        private MySingleton() { }
//        private static final MySingleton INSTANCE = new MySingleton();
//        public static MySingleton getInstance() { return INSTANCE; }

//        private Object readResolve() throws ObjectStreamException {

//            return INSTANCE;
//        }
//    }
}
