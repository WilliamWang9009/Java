package william;

import java.util.Scanner;

public class whileTest3 {
    public static void main(String[] args) {
        //定义变量用来记录被除数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个被除数:");
        int number1 = sc.nextInt();
        System.out.println("输入一个除数:");
        int number2 = sc.nextInt();
        //定义一个变量, 用来记录减的次数
        int count = 0;

        while (number1 >= number2){
            number1 = number1 - number2;
            count++;
        }
        System.out.println("余数为" + number1);
        System.out.println("商为" + count);
    }


}
