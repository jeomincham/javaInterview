package Interview.designModels.singleton;

/**
 * @Author chendm
 * @Date 2020/1/7 15:58
 * @Description  懒汉式
 *                简单的懒汉式不是线程安全的
 */
public class Singleton4 {

    //2.当前类的实例属性
    private static Singleton4 instance = null; //静态的实例属性，


    //1,私有化构造器，对象不能通过外界的构造方法实现
    private Singleton4(){

    }

    //3.对外提供获取当前对象的方法
    public static Singleton4 getInstance(){
        if (instance==null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance=new Singleton4();
        }
        return instance ;
    }

}
