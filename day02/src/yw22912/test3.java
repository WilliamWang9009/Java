package yw22912;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //考试奖励
        //分析
        //1. 定义变量, 用来记录小明的名次
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的名次");
        int ranking = sc.nextInt();
        //2. 对小明的名次进行判断
        if(ranking == 1){
            System.out.println("小红成为了小明的女朋友");
        }
        else{
            System.out.println("黄了");
        }
    }
}
