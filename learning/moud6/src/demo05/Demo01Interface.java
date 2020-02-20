package demo05;
/*
使用接口时的注意事项：

1 .接口没有静态代码块或者构造方法
2 .一个类可以同时实现多个接口
格式：
public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB{
    // 覆盖重写所有抽象方法
}
3 .如果实现的多个接口中，存在重复的抽象方法，那么只需要重写一次即可
4 .如果实现的多个接口中，存在重复的默认方法，那么实现类一定要对重复的默认方法重写
5 .如果一个类的直接父类中的方法和接口当中的默认方法产生冲突，会优先用父类当中的方法。
 */
public class Demo01Interface {
}
