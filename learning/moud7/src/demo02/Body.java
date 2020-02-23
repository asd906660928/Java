package demo02;

public class Body { // 外部类

    public class Heart { // 成员内部类

        // 内部类方法
        public void beat() {
            System.out.println("心脏跳动");
        }
    }

    // 外部类成员变量
    private String name;

    // 外部类的方法
    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat(); // 匿名对象
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
