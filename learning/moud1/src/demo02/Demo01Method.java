package demo02;

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }
/*
方法定义格式：
public static void 方法名称(){
        方法体
}
 */

    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

