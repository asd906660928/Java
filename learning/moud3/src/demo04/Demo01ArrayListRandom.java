package demo04;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
生成6个1-33之间的随机整数，添加到集合，并遍历集合。

步骤：
1.生成随机数
2.添加到集合
3.遍历集合
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        // 创建随机数
        Random num = new Random();

        // 创建集合
        ArrayList<Integer> list = new ArrayList<>();

        // 用for循环 生成6个随机数，并且添加到集合中
        for (int i = 0; i < 6; i++) {
            list.add(num.nextInt(33) + 1);
        }

        // 打印集合
        System.out.println(list);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
