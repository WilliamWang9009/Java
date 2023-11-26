package william;

public class methodTest7 {
    public static void main(String[] args) {
        //定义数组
        int [] array = {1, 5, 7, 3, 8, 10};
        //调用方法最大值
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int [] array) {
        int max = array[0];
        for (int i = 1; i <array.length; i++){
            if (array[i] > max){
                max = array[i];
            }

        }
        return max;

    }

}
