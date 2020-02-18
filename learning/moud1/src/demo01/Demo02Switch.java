package day01;

public class Demo02Switch {
    public static void main(String[] args) {
        int num = 1;
        switch (num){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            default:
                System.out.println("数据错误");
                break;
        }
    }
}
