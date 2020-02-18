package demo05;
/*
题目：
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？

分析：
1.有范围，用for循环
2.起点位置-10.8应该转换为-10.0
    2.1可以使用Math.ceil方法向上取整
    2.2强转为int
3.绝对值：Math.abs方法。
 */
public class Demo01MathPractise {
    public static void main(String[] args) {
        int count = 0; // 符合要求的个数

        double min = -10.8;
        double max = 5.9;
        // 强转换之后，变量就都是整数
        for (int i = (int) min; i < max; i++){
            int abs = Math.abs(i);
            if (abs < 2.1 || abs > 6){
                count++;
            }
        }
        System.out.println(count);
    }
}
