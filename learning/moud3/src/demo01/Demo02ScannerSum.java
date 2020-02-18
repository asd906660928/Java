package demo01;
import java.util.Scanner;
/*
键盘输入两个数字，并且求和
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 提示输入数字
        System.out.print("请输入第一个数字：");

        // 获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("输入的数据：" + num);

        // 提示输入第二个数字
        System.out.print("请输入第二个数字：");

        int num2 = sc.nextInt();
        System.out.println("输入的数据：" + num2);

        // 计算和
        int result = num + num2;
        // 输出求和结果
        System.out.println("和是：" + result);
    }

}
