package demo05;

public interface MyInterfaceA {

    void methodA();

    void method();

    default void methodDefault(){
        System.out.println("A的默认方法");
    }
}
