package william;

public class arrayTest2 {
    public static void main(String[] args) {
        //定义一个数组
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        //遍历数组
        for (int i = 0; i <array.length; i++){
//            System.out.println(array[i]);
            if(array[i] % 3 ==0){
                count += 1;
            }
        }
        System.out.println(count);

        //判断, 当前元素是否为3的倍数
    }
}
