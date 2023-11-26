package william;

public class arrayTest {
    public static void main(String[] args) {
        //定义一个数组, 并添加数据
        int [] array = {1,2,3,4,5};
        int sum = 0;

        //遍历数组, 得出每一个数据, 然后累加求和
        for (int i = 0; i <array.length;i++){
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println(sum);
    }
}
