package demo03;

import demo01.Student;

public class Demo01Private1 {

    public static void main(String[] args) {
        private1 student = new private1();
        student.name = "赵丽颖";
        student.setAge(20);
        student.show();
        System.out.println("**************");
        student.name = "赵丽颖";
        student.setAge(-20);






    }

}
