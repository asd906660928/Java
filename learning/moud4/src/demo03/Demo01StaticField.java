package demo03;
/*
如果成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共用一份数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Students.room = "101";
        Students one = new Students("张三", 18);
        Students two = new Students("李四", 20);

        System.out.println("学号是：" + one.getId()
                + "，姓名是：" + one.getName()
                + "，年龄是：" + one.getAge()
                + "，教室是：" + Students.room);
    }
}
