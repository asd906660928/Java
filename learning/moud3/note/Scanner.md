###Scanner类的功能，可以实现键盘输入数据到程序中

- 引用类型的一般使用步骤：

    1.导包

    import 包路径.类名称

    只有java.lang 包下的内容不需要导包，其他都需要导包

    2.创建
    类名称 对象名 = new 类名称（）；

    3.使用
    对象名.成员方法名（）

获取键盘输入的一个int数字：int num = sc.nextInt();

如果要获取键盘输入的一个String字符串：String str = sc.next();