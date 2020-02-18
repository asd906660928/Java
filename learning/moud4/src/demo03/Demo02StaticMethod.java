package demo03;
/*
基本概念：
一旦使用static修饰成员方法，那么就成为了静态方法，静态方法不属于对象，是属于类的

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它

注意事项：
1.静态不能直接访问非静态。
原因：在内存当中，是先有的静态，后有的非静态。
"先人不知道后人，但是后人知道先人"
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        // 首先创建对象才能使用此方法。
        MyClass obj = new MyClass();
        obj.method();
        // 对于静态方法来说，可以直接通过类名称调用方法。
        MyClass.methodStatic();
    }
}
