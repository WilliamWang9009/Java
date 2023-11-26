package yw22912;

import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入身上的钱的数量:");
        int money = sc.nextInt();

        if (money > 100){
            System.out.println("去吃网红餐厅.");
        }else {
            System.out.println("去吃沙县小吃.");
        }
    }
}
