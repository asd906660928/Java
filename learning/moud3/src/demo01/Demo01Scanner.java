package demo01;

import java.util.Scanner;
/*
Scanner类的功能，可以实现键盘输入数据到程序中

引用类型的一般使用步骤：
1.导包
import 包路径.类名称
只有java.lang 包下的内容不需要导包，其他都需要导包

2.创建
类名称 对象名 = new 类名称（）；

3.使用
对象名.成员方法名（）

获取键盘输入的一个int数字：int num = sc.nextInt();
如果要获取键盘输入的一个String字符串：String str = sc.next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        // System.in 代表从键盘进行输入
        // 也是现阶段的固定写法
        Scanner sc = new Scanner(System.in);

        // 获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("输入的数据：" + num);


    }



}
