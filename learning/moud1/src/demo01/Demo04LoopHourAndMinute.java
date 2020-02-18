package day01;

public class Demo04LoopHourAndMinute {
    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) { // 外层控制小时

            for (int min = 0; min < 60; min++){  // 内层控制小时之内的分钟

                System.out.println(hour + "点" + min + "分");


            }
        }
    }
}
