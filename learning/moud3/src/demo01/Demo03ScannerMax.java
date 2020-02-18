package demo01;

import java.util.Scanner;

/*
输入三个数字
求出最大值
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        // 提示输入第一个数字
        System.out.print("请输入第一个数字：");
        int a = num.nextInt();
        // 提示输入第二个数字
        System.out.print("请输入第二个数字：");
        int b = num.nextInt();
        // 提示输入第三个数字
        System.out.print("请输入第三个数字：");
        int c = num.nextInt();

//        // 把数字装在一个数组里
//        int [] array = { a, b, c};
//        // 定义一个最大值
//        int max = array[0];
//        // 比较数字选出最大的打印出来
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max){
//                max = array[i];
//            }
//
//        }
//        // 输出最大值
//        System.out.println("最大值是：" + max);
        // 用三元运算符比较大小
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        // 输出
        System.out.println("最大值是：" + max);

        }
    }
