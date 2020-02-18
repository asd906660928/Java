package demo04;

import java.util.Arrays;

/*
Arrays是一个与数组相关的工具类，里面有大量的静态方法，用来实现数组常见的操作。

public static String toString(数组)：将参数数组变成字符串（按照默认格式：[1, 2, 3]）
public static void Short(数组)：将参数数组按照默认升序进行排序。

备注：
1.如果是数值，sort默认升序
2.如果是字符串，默认按照字母升序
3.如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。（后面学习）
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        // 将int数组按照默认格式转换成字符串
        String intString = Arrays.toString(intArray);
        System.out.println(intString);
    }
}
