package yw22912;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入酒量:");
        int wine = sc.nextInt();
        if (wine >2){
            //语句体
            System.out.println("小伙子不错哦!");
        }
        else {
            System.out.println("你不行!");
        }
    }
}
