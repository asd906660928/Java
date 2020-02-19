package demo01;

import java.util.ArrayList;

public class Demo01MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member A = new Member("成员A", 0);
        Member B = new Member("成员B", 0);
        Member C = new Member("成员C", 0);

        manager.show(); // 100
        A.show(); // 0
        B.show(); // 0
        C.show(); // 0
        System.out.println("===============");

        // 群主总共发20块钱，分成三份
        ArrayList<Integer> redList = manager.send(20, 3);
        // 三个成员收红包
        A.receive(redList);
        B.receive(redList);
        C.receive(redList);

        manager.show(); // 80
        A.show();
        B.show();
        C.show();
    }

}
