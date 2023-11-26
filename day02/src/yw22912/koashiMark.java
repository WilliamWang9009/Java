package yw22912;

import java.util.Scanner;

public class koashiMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的考试分数:");
        int mark = sc.nextInt();

        if(mark >= 0 && mark <= 100){
            if (mark >= 95 && mark <=100){
                System.out.println("送自行车一辆.");
            }else if (mark >= 90 && mark <= 94){
                System.out.println("去游乐园玩一天.");
            }else if(mark >= 80 && mark <= 89){
                System.out.println("买一个变形金刚.");
            }else {
                System.out.println("揍一顿吧!");
            }
        }
    }
}
