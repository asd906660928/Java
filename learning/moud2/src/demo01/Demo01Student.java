package demo01;
/*
通常情况下，类不能单独使用，需要先创建一个对象，才能使用
1.导包：指出类在什么位置
import 包名称，类名称
import moud2.demo01.Student；
2.创建对象
类名称 对象名（自己起） = new 类名称（）
Student stu = new Student（）；
3.使用
    1.使用变量：对象名.变量名
    2.使用方法：对象名.方法名
 */

public class Demo01Student {

    public static void main(String[] args) {

        // 创建
        Student stu = new Student();
        // 调用
        System.out.println(stu.name);
        // 给

    }

}
