package demo05;

public interface MyInterfaceB {
    void methodB();

    void method();

    default void methodDefault(){
        System.out.println("B的默认方法");
    }
}
