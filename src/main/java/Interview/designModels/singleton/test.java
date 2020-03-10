package Interview.designModels.singleton;
import java.util.ArrayList;
//使用JDK的ArrayList<t>
/**
 * @Author chendm
 * @Date 2020/1/8 20:43
 * @Description
 */
public class test {


    public static void main(String[] args) {
        Fu z = new Fu();
        z.show();
    }

}


//父类
class Fu {
    int num1 = 3;
    public Fu() {
        System.out.println("父类构造函数");
    }
    void show() {
        System.out.println("父类方法调用");
        System.out.println(num1);
    }
}

//子类
class Zi extends Fu {
    int num2 = 4;

    public Zi(int num2) {
        this.num2 = num2;
        System.out.println("子类带参构造方法");
    }

    public Zi() {
        System.out.println("子类无参构造方法");
    }

    @Override
    void show() {
        System.out.println("子类方法调用");
        System.out.println(num1);
        System.out.println(num2);
    }

}
