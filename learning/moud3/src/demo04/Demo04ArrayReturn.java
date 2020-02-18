package demo04;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存20个随机数字，然后筛选其中的偶数元素，放到小集合中
要求使用自定义的方法实现筛选

思路：
创建20个随机数，放到集合里。<Integer>
创建方法，遍历集合，如果是偶数，放到新集合中
创建方法三要素：
返回值类型：ArrayList（偶数）
方法名称：returnList
参数列表：ArrayList（20个）
判断：num % 2 == 0
 */
public class Demo04ArrayReturn {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> bigList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            bigList.add(num);
        }

        ArrayList<Integer> finList = returnList(bigList);
        System.out.println( "总共有" + finList.size() + "个偶数");
        for (int i = 0; i < finList.size(); i++) {
            System.out.println(finList.get(i));
        }

    }
    // 这个方法接收大集合，返回小集合
    public static ArrayList<Integer> returnList(ArrayList<Integer> bigList){
        // 创建一个小集合装偶数
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0){
                smallList.add(num);
            }

        }
        return smallList;
    }

}
