package william;

public class arrayDemo2 {
    public static void main(String[] args) {
        //定义数组
        int [] arr = {1,2,3,4,5};
        //获取数组里面的所有的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //用for循环
        for (int i = 0; i < 5; i++){
            System.out.println(arr[i]);

        }
        //获取数组长度
        System.out.println(arr.length);
        //最终版本
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }
    }
}
