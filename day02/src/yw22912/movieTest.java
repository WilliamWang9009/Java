package yw22912;

import java.util.Scanner;

public class movieTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入1~100之间的序号:");
        int number = sc.nextInt();

        //对票号进行真实有效性判断
        if(number >= 1 && number <= 100) {
            if (number % 2 == 0) {
                System.out.println("坐右侧");
            } else {
                System.out.println("坐左侧");
            }

        }

    }
}
