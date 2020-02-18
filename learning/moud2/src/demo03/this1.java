package demo03;

public class this1 {
    // 我自己的名字
    String name;
    // 定义一个打招呼的类，参数who是对方的名字
    public void sayHello(String who){
        System.out.println(who + "你好，我是" + name);
    }

    // 如果这里的参数名和我自己的名字的变量名称相同
    // this.name在哪，哪个就是我的name
    public void sayHello1(String name){
        System.out.println( name + "你好，我是" + this.name);
    }


}
