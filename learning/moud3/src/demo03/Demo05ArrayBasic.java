package demo03;

import java.util.ArrayList;

/*
如果想向集合里存储基本类型数据，需要使用基本类型对应的“包装类”

基本类型        包装类（属于引用类型，包装类都位于java.lang下）
byte            Byte
short           Short
int             Integer [特殊]
long            Long
float           Float
double          Double
char            Character   [特殊]
boolean         Boolean
 */
public class Demo05ArrayBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        System.out.println(list.get(0));
    }
}
