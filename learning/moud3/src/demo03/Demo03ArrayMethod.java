package demo03;

import java.util.ArrayList;

/*
ArrayList常用方法：

public boolean add(E e):向集合中添加元素，类型和泛型一致。
public E get(索引值)：获取集合中的元素
public E remove(索引值)：删除集合中的元素
public int size():获取长度，返回值是集合里元素的个数。
 */
public class Demo03ArrayMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        System.out.println(list);
        // 获取集合中的元素
        String name = list.get(0);
        System.out.println(name);
        // 删除
        String WhoRemoved = list.remove(1);
        System.out.println(WhoRemoved + "被删除了");
        // 获取长度
        System.out.println(list);
        int size = list.size();
        System.out.println("有" + size + "个元素");

    }
}
