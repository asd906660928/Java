package demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {

        // 单独调用
        sum(10, 20);
        System.out.println("=====================");

        // 打印调用
        System.out.println(sum(15, 10));
        System.out.println("=====================");

        // 赋值调用
        int number = sum(20, 30);
        System.out.println("变量值为：" + number);

    }

    public static int sum (int a, int b){
        System.out.println("调用成功");
        int result = a + b;
        return result;
    }
}
