package demo04;
/*
如果接口的实现类（或者是父类的子类）只需要用唯一的一次。
那么这种情况下就可以省略掉该类的定义（不需要定义MyInterfaceImpl），而改为使用【匿名内部类】。

匿名内部类定义格式:
接口名称 对象名 = new 接口名称() {
    // 覆盖重写所有抽象方法
};

注意事项：
1 .匿名内部类在【创建对象】的时候，只能使用唯一一次。
如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了。
2 .匿名对象在【调用方法】的时候，只能调用唯一一次。
如果希望同一个对象调用多次方法，那么必须给对象起个名字
3 .匿名内部类是省略了【实现类/子类】，但是匿名对象是省略了【对象名称】
 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterfaceImpl impl = new MyInterfaceImpl();
//        impl.method();

        // 使用匿名内部类，对象名称就叫obj
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();

        // 使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        }.method();

    }
}
