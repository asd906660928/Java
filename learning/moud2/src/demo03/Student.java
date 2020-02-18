package demo03;

/*
构造方法是用来专门创建对象的方法，当我们通过关键字new来创造对象时，其实就是在调用构造方法
只不过在我们没有主动定义构造方法的时候，IDE会自动生成一个赠送给我们
格式：
public 类名称（参数类型 参数名称）{
    方法体
}
注意事项：
1.构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
2.构造方法不要写返回值类型，连void都不要写
 */
public class Student {
    // 成员变量
    private String name;
    private int age;
    // 无参构造方法
    public Student(){
        System.out.println("无参构造方法执行了");
    }
    // 全参构造方法
    public Student(String name, int age){
        System.out.println("全参构造方法执行了");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}


