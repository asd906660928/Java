package demo02;
/*
题目：
定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。
格式参照：[world1#world2#world3]。

分析：
1.首先准备一个int[]数组，内容123
2.定义一个方法，用来将数组变成字符串
三要素:
返回值类型：String
方法名称：fromArrayTOString
参数列表：int[]
3.格式：[world1#world2#world3]
 */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        String result = fromArrayTOString(array);
        System.out.println(result);
    }
    // 定义方法
    public static String fromArrayTOString(int[]array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                str += "world" + array[i] + "]";
            }else {
                str += "world" + array[i] + "#";
            }
        }
        return str;

    }
}
