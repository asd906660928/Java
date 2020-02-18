package demo02;

import java.util.Scanner;

/*
题目：键盘输入一个字符串，统计其中各种字符出现的次数。
种类包括：大写字母，小写字母，数字，其他

思路：
创建一个字符串，键盘输入内容（scanner）
需要对字符串一个字一个字检查，那么需要转换成char[]，方法是toCharArray
遍历char[]字符数组，按照条件判断
 */
public class Demo07StringCont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str = sc.next();

        int cA = 0;
        int ca = 0;
        int num = 0;
        int other = 0;

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if ('A' <= ch && ch <= 'Z'){
                cA++;
            }else if ('a' <= ch && ch <= 'z'){
                ca++;
            }else if ('0' <= ch && ch <= '9'){
                num++;
            }else {
                other++;
            }
        }
        System.out.println("大写字母有：" + cA);
        System.out.println("小写字母有：" + ca);
        System.out.println("数字有：" + num);
        System.out.println("其他有：" + other);
    }
}
