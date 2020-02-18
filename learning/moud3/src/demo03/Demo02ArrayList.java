package demo03;

import java.util.ArrayList;

/*
数组长度不能改变
arrayList长度可以改变。

对于arrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合里的所有元素，都是相同的类型。
注意：泛型只能是引用类型，不能是基本类型。
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        // 创建一个ArrayList集合，集合的名称是list，里面装的都是String类型。
        ArrayList<String> list = new ArrayList<>();

        // 向集合中添加一些数据，需要用add方法。
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

    }
}
