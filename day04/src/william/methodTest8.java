package william;

public class methodTest8 {
    public static void main(String[] args) {
        //定义原始数组
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //调用方法拷贝数组
        int [] copyArr = copyOfRange(array, 3, 7);
        //遍历copyArr
        for (int i = 0; i<copyArr.length; i++){
            System.out.print(copyArr[i] + " ");
        }
    }

    public static int[] copyOfRange(int [] array, int from, int to) {
        //1. 定义数组
        //2. 动态
        int [] newArr = new int[to - from];
        //把原始数组arr中的from到to上对应的元素, 直接拷贝到新数组中
        int index = 0;
        for (int i = from; i < to; i++){
            //格式: 数组名[索引] = 数据值;
            newArr[index] = array[i];
            index++;
        }
        //把新数组返回
        return newArr;
    }
}
