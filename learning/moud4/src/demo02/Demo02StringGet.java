package demo02;
/*
String当中与 获取 相关的方法：
public int length（）：获取字符串中的字符个数
public String concat（String str）： 讲当前字符串和参数字符串拼接组成新的字符串
public int indexOf（String str）： 查找参数字符在本字符串中首次出现的索引位置，如果没有返回-1
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        // 获取字符串长度
        int length = "asdhasudhaosihfoasfhoaisf".length();

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        // 查找字符索引
        String str4 = "HelloWorld";
        int index = str4.indexOf("llo");
    }
}
