package Interview.designModels.singleton;

import org.junit.Test;

/**
 * @Author chendm
 * @Date 2020/1/7 15:51
 * @Description
 *
 *    枚举单例测试类
 */
public class SingletonEnumTest {
    @Test
    public void test1(){
        Singleton3 instance1 = Singleton3.INSTANCE;
        Singleton3 instance2 = Singleton3.INSTANCE;
        System.out.println(instance1==instance2);
    }

}
