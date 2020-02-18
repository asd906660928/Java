package demo02;

/*
定义一个类，模拟手机
属性：品牌，价格，颜色
行为：打电话，发短信
 */
public class Phone {

    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("给" + who + "打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
