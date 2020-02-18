package day01;

public class Demo03Continue1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if (i ==4){  // 如果当前是第四层
                continue;  // 那么跳过当次循环，马上进入下一次（第五层）
            }
            System.out.println(i + "楼到了");
        }
    }
}
