package demo04;

import java.util.ArrayList;

/*
题目：
定义四个学生对象，添加到集合，并遍历。
思路：
1.自定义一个Student学生类，四个部分（getter，setter,全参，无参）
2.创建一个集合，来存储学生对象。泛型<Student>
3.根据类，创建四个学生对象。
4.将4个学生对象添加到集合中：add
5.遍历集合
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("迪丽热巴", 18);
        Student two = new Student("萨瓦迪卡", 19);
        Student three = new Student("古力娜扎", 24);
        Student four = new Student("塞尔图吧", 50);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println( "姓名："  + stu.getName() + "，年龄：" + stu.getAge());

        }
    }
}
