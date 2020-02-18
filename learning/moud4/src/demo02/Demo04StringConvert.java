package demo02;
/*
String当中与转换相关的常用方法有：

public char[] toCharArray(): 将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes(): 获取当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString):
将所有出现的老字符串替换成为新字符串，返回替换之后的新字符串。
备注：CharSequence意思是可以接受字符串类型
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        // 转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        // 转换成为字节数组
        byte[] bytes = "Hello".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        // 替换
        String str = "How do you do";
        System.out.println(str);
        String str2 = str.replace("o", "*");
        System.out.println(str2);

    }
}
