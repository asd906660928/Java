package demo04;

import java.util.ArrayList;

/*
题目：
定义一个打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@分隔符分隔每个元素
格式参照：{元素@元素@元素}
 */
public class Demo03ArrayPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("sss");
        list.add("啊啊啊");
        list.add("111");
        list.add("***");

        printArrayList(list);
    }
    /*
    定义方法的三要素
    返回值类型：没有运算，没有结果，只是打印，没有返回值，所以用void
    方法名称：printArrayList
    参数列表：ArrayList
     */
    public static void printArrayList(ArrayList<String> list){
        // {元素@元素@元素}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1){
                System.out.print(name + "}");
            }else{
                System.out.print(name + "@");
            }


        }
    }

}
