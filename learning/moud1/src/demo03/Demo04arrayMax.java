package demo03;

public class Demo04arrayMax {

    public static void main(String[] args) {

        int[] arrayA = {1,2,3,4,5,6,7,8,9,10};

        int max = arrayA[0]; // 比较台,0号元素先在台上等待比较
        for (int i = 1; i < arrayA.length; i++) {
            // 如果有比max更大的元素，则替换
            if (arrayA[i] > max);{
                max = arrayA[i];
            }

        }
        System.out.println("最大值为：" + max);


    }

}
