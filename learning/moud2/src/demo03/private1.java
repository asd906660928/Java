package demo03;

/*
问题：为了防止不合理的数据传入进来
所以用private关键字来保护成员变量

但是：
一旦使用了private，那么出了本类之外就不能直接访问这个成员变量了。
 */
public class private1 {

    String name;  // 姓名
    private int age;  // 年龄

    public void show() {
        System.out.println("我叫" + name + "年龄" + age);
    }

    // 这个方法是给成员变量age设置数据
    public void setAge(int num) {
        if (num < 100 && num >= 0) {
            age = num;
        } else {
            System.out.println("数据类型错误。");
        }
    }
    //  这个是获取age的数据
    public int getAge () {
        return age;
    }


}