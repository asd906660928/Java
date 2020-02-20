package demo04;
/*
当需要一个共有方法，用来解决两个默认方法之间代码重复的问题时。需要创建一个私有化方法
1 .普通私有方法(解决多个默认方法之间重复代码问题)
格式：
private 返回值类型 方法名称(参数列表) {
    方法体
}

2 .静态私有方法(解决多个静态方法之间重复代码问题)
格式：
private static 返回值名称 方法名称(参数列表) {
    方法体
}
 */
public interface MyInterfacePrivateA {
    public default void methodDefault(){
        System.out.println("默认方法1");
        methodCommon();
    }

    default void methodDefault2() {
        System.out.println("默认方法2");
        methodCommon();
    }

    private  void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
