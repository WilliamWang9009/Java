package yw22912;

import java.util.Scanner;

public class mathTest {
    public static void main(String[] args) {
        // 键盘录入一个三位数, 然后获取它的个位十位百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int number = sc.nextInt();

        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;

        System.out.println("个位数是" + ge);
        System.out.println("十位数是" + shi);
        System.out.println("百位数是" + bai);

    }
}
