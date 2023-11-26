package william;

import java.util.Scanner;

public class whileTest2 {
    public static void main(String[] args) {
        //回文数
        //核心思路:把数字倒过来,在跟原来的数字进行比较
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于3位数的数字:");
        int number = sc.nextInt();
        //定义一个临时变量, 用来记录number原来的值
        int temp = number;
        int num = 0;
        while (number != 0){
            //从右往左获取每一位数字123
            int ge = number % 10;
            number /= 10;
            //吧当前获取的数字拼接到最右边
            num = num* 10 +ge;
            System.out.println(number);
        }
        System.out.println(num);
        System.out.println(num == temp);
    }
}
