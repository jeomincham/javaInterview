package Interview.designModels.singleton;

/**
 * @Author chendm
 * @Date 2020/1/7 15:46
 * @Description  枚举式：简单高效
 */
public enum  Singleton3 {

    INSTANCE{
        @Override
        protected void doSomething() {
            System.out.println("doSomething");

        }
    };

    protected abstract void doSomething();
}
