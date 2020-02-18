package demo04;

import java.util.Arrays;

/*
题目：
使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒叙打印

 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "ssfdfdfdfdsdfsfds";

        // 进行升序排列：sort
        // 必须是数组才能用sort方法排列
        // 变成数组用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        // 倒叙遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
