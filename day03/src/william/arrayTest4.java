package william;

public class arrayTest4 {
    public static void main(String[] args) {
        //1. 定义数组用来存储五个值
        int [] array = {33, 5, 22, 44, 55};
        int max = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
