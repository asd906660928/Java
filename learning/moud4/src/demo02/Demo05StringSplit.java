package demo02;
/*
分割字符串的方法：
public String[] split(String regex): 按照参数的规则，将字符串分割成若干部分

注意事项：
split方法的参数其实是一个“正则表达式”
如果按照英文句号切割，需要写成"\\."
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str = "aaa,bbb,ccc";
        String[] array1 = str.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }
}
