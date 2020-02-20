package demo03;
/*
注意：不能通过接口实现类的对象来调用接口中的静态方法
正确用法：通过接口名称，直接调用接口中的静态方法
格式:
接口名称.静态方法名(参数)；
 */
public class Demo01Interface {
    public static void main(String[] args) {

//        // 创建实现类对象
//        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

//        // 错误写法
//        impl.methodStatic();

        // 直接通过接口名称来调用接口中的静态方法
        MyInterfaceStatic.methodStatic();
    }
}
