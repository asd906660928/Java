package demo03;

/*
定义数组有两种
动态初始化（指定长度）：创建的时候，直接指定数组的长度
静态初始化（指定内容）：创建的时候，不指定数组长度，而是将内容写入

注意事项：
1.静态初始化没有直接指定长度，但是会自动推算出长度
2.静态初始化标准格式可以拆分为两个步骤：
    int[] arrayB;
    new arrayB = []{ 1, 2, 3};
3.静态初始化一旦使用省略格式，就不能拆分为两个步骤了。
4.动态初始化也能分为两个步骤:
    int[] arrayC;
    new arrayC = [10];

使用建议：
如果不确定数组当中的具体内容，用动态，否则，用动态。
 */
public class Demo01Array {

    public static void main(String[] args) {
        // 动态
        int[] arrayA = new int[300];

        // 静态(基本格式)
        int[] arrayB = new int[]{ 1, 2, 3};

        // 静态（省略格式）
        int[] arrayC = { 2, 3, 4};


    }

}
