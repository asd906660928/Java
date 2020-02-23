package demo02;

public class Demo01InnerClass {

    public static void main(String[] args) {
        Body body = new Body(); // 外部类对象
        // 通过外部类对象，调用外部类的方法，来间接使用内部类Heart
        body.methodBody();

        // 直接调用
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
