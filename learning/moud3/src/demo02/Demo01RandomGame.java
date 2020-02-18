package demo02;

import java.util.Random;
import java.util.Scanner;

/*
Random类用来生成随机数。三个步骤
1.导包
2.创建
Random r = new Random；
3.使用
获取一个随机int数：r.nextInt；（范围是int所有范围，有正和负）
获取一个随机int数：r.nextInt();（参数假如是10，那么代表区间为（0~9），如果整体+1，代表[1~10]）
 */
public class Demo01RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int ran = r.nextInt(10) + 1;
        Scanner num = new Scanner(System.in);

        while (true){
            System.out.print("请输入数字：");
            int result = num.nextInt();
            if (ran > result){
                System.out.println("太小了，重新输入");
            }else if (ran < result){
                System.out.println("太大了，重新输入");
            }else {
                System.out.println("正确");
                break;
            }
        }
    }
}
