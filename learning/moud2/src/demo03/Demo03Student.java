package demo03;

public class Demo03Student {

    public static void main(String[] args) {

        Student stu = new Student();
        System.out.println("===============");
        Student stu2 = new Student("赵丽颖", 18);
        System.out.println("姓名" + stu2.getName()+"，年龄"+ stu2.getAge());

        stu2.setAge(20);
        stu2.setName("小赵丽颖");
        System.out.println("姓名" + stu2.getName()+"，年龄"+ stu2.getAge());

    }

}
