package demo02;
/*
== 是进行地址值的比较，如果需要字符串的内容比较，可以使用两个方法：

public boolean equals(Object obj): 参数可以是任何对象，只有参数是一个字符串且内容相同才会返回true，否则返回false。
注意事项：
1.任何对象都能用obj进行接收
2.equals方法具有对称性，也就是先写哪个都一样
3.如果比较的是一个常量，一个变量。推荐把常量字符串写在前面。
    推荐： "abc".equals(str)
    不推荐：  str.equals("abc")
4.public boolean equalsIgnoreCase(String str): 忽略大小写进行内容比较。
 */
public class Demo01StringEquals {
}
