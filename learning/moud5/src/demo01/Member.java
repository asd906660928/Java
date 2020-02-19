package demo01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    // 收红包方法
    public void receive(ArrayList<Integer> list){
        // 从多个红包当中随便抽取一个，给我自己。
        // 随机获取一个list集合当中的索引编号
        int index = new Random().nextInt(list.size());
        // 根据索引，从集合当中删除，并且得到被删除的数据，给自己
        Integer delta = list.remove(index);
        // 当前成员自己本来有多少钱
        int money = super.getMoney();
        // 获取完数值，重新设置回去
        super.setMoney(money + delta);
    }
}
