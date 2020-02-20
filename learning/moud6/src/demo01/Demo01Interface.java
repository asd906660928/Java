package demo01;
/*
接口就是多个类的公共规范。
接口是引用类型，最重要的内容就是其中的抽象方法

如何定义一个接口：
public interface 接口名称{
    // 接口内容
}

接口使用步骤:
1 .接口不能直接使用，必须有一个实现类 来实现该接口。
格式：
public class 实现类名称 implements 接口名称 {
    // ...
}
2 .接口的实现类必须覆盖重写(实现)接口中所有的抽象方法。
实现：去掉abstract关键字，加上方法大括号。
3 .创建实现类的对象，进行使用
 */
public class Demo01Interface {
    public static void main(String[] args) {
//        // 这是错误写法，不能直接new接口对象使用。
//        MyInterfaceAbstract inter = new MyInterfaceAbstract;

        // 创建实现类的对象使用
        MyInterfaceAbstractImpl inter = new MyInterfaceAbstractImpl();
        inter.methodAbs();
    }
}
