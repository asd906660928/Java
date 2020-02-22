package demo01;

public class DemoMain {

    public static void main(String[] args) {

        // 首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        // 准备鼠标
        USB usbM = new Mouse(); // 多态写法
        computer.useDevice(usbM);

        // 准备键盘
        KeyBoard usbK = new KeyBoard(); // 没有使用多态写法
        computer.useDevice(usbK); // 正确写法！也发生了向上转型

        computer.powerOff();
    }
}
