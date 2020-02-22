package demo01;

public class Computer {

    public void powerOn() {
        System.out.println("开机");
    }

    public void powerOff() {
        System.out.println("关机");
    }

    // 使用USB设备的方法
    public void useDevice(USB usb){
        usb.open();
        if (usb instanceof Mouse){ // 一定要先判断
            Mouse mouse = (Mouse) usb; // 向下转型
            mouse.click();
        }else if (usb instanceof KeyBoard){ // 先判断
            KeyBoard keyBoard = (KeyBoard) usb; // 向下转型
            keyBoard.type();
        }
        usb.close();
    }
}
