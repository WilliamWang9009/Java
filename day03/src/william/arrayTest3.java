package william;

public class arrayTest3 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        //遍历数组
        //如果是奇数, 将数字扩大两倍
        //如果是偶数, 则将数字变成二分之一
        for (int i = 0; i <array.length; i++){
            if(array[i] %2 == 1){
                array[i] *= 2;
            }else {
                array[i] /= 2;
            }
            System.out.println(array[i]);
        }
    }
}
