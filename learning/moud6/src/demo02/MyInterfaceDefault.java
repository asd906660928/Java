package demo02;
/*
接口的默认方法定义格式：
public default 返回值类型 方法名称(参数列表){
        方法体
        }

备注：接口当中的默认方法，可以解决接口升级问题。
 */
public interface MyInterfaceDefault {

    // 抽象方法
    void methodA();

    // 默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
