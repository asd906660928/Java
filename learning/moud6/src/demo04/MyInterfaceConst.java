package demo04;
/*
接口中的常量

接口当中也可以定义"成员变量"，但是必须使用public static final三个关键字进行修饰。
从效果上看，这其实就是接口的【常量】
格式:
public static final 数据类型 常量名 = 数据值

注意事项：
1 .接口中的常量，前面的修饰字符可以不写
2 .必须进行赋值
3 .名称必须完全大写,用下划线连接

 */
public interface MyInterfaceConst {
    // 这就是一个常量
    public static final int NUM_OF_MY_CLASS = 10;
}
