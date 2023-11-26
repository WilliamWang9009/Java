package william;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        double pay = sc.nextInt();
        System.out.println("请输入当前月份:");
        int month = sc.nextInt();
        System.out.println("请输入机票类别头等舱1或经济舱2:");
        int sit = sc.nextInt();

        // double result = 0;

        //1. 判断月份
        if (month == 5 || month == 6 || month == 7 ||month == 8 || month == 9 ||month == 10){
            if (sit == 1){
                double result = pay *0.9;
                System.out.println(result);
            }else{
                double result = pay * 0.85;
                System.out.println(result);
            }
        }else {
            if (sit == 1){
                double result = pay * 0.7;
                System.out.println(result);

            }else{
                double result = pay * 0.65;
                System.out.println(result);
            }
        }
    }
}
