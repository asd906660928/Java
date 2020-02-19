package demo01;

import java.util.ArrayList;

public class Manager extends User {

    public Manager(){
        // super()
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    // 发红包方法
    public ArrayList<Integer> send(int totalMoney, int count){
        // 首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        // 首先看一下群主有多少钱
        int leftMoney = super.getMoney();// 群主当前余额
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList; // 返回空集合
        }

        // 扣钱(其实就是重新设置余额)
        super.setMoney(leftMoney - totalMoney);

        // 发红包,需要平均拆分count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; // 余数，也就是零头
        // 剩下的钱包在最后一个红包当中
        // 下面把这个红包一个一个放在集合中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        // 最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
