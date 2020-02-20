package demo03;
/*
接口中定义静态方法格式：
public static 返回值类型 方法名称(参数列表){
    方法体
}
就是将abstract或者default换成static，再带上方法体。
 */
public interface MyInterfaceStatic {

    public static void methodStatic(){
        System.out.println("这是接口的静态方法");
    }

}
