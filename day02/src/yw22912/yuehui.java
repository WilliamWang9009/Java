package yw22912;

import java.util.Scanner;

public class yuehui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我自己的衣服时髦度:");
        int myfashion = sc.nextInt();
        System.out.println("请输入相亲对象的衣服时髦度:");
        int girlfashion = sc.nextInt();

        boolean result = myfashion > girlfashion;
        System.out.println(result);
    }
}
