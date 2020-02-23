package demo03;

public class Outer {

    public void methodOuter() {
        class Inner { // 局部内部类
            int num = 10;
            public void methodInner() {
                System.out.println(num);
            }
        }
        // 创建一个对象，再调用Outer就行了
        Inner inner = new Inner();
        inner.methodInner();
    }
}
