package demo02;

public class Demo01Phone {
    public static void main(String[] args) {

        // 根据phone创建一个对象,叫Phone1
        // 格式：类名称 对象名 = new 类名称（）
        Phone phone1 = new Phone();
        System.out.println(phone1.brand);
        phone1.call("张三");
    }
}
