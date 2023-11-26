package william;

import java.util.Random;

public class arrayTest5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        //把随机数存入数组当中
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {

            int number = r.nextInt(100) + 1;
            //把生成的随机数添加到数组当中
            array[i] = number;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
