package day01;

public class Demo01HunderdSum {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                num += i;
            }

        }
        System.out.println("结果是：" + num);
    }
}
