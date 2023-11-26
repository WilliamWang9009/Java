package william;

public class methodTest6 {
    public static void main(String[] args) {
        //定义数组
        int [] array= {11, 22, 33, 44, 55};
        printArr(array);
    }
    //定义方法用于数组的遍历
    public static void printArr(int [] array) {
        for (int i = 0;i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
