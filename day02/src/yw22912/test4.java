package yw22912;

public class test4 {
    public static void main(String[] args) {
        //如果红灯亮, 就停止
        //如果黄灯亮, 就减速
        //如果绿灯亮, 就通行

        //1. 定义三个变量表示灯的状态
        //true 亮, false 灭
        boolean green = false;
        boolean yellow = false;
        boolean red = true;

        //2. 判断
        //红灯亮, 就停止
        if (red){
            System.out.println("停止");
        }
        //黄灯亮, 就减速
        if (yellow){
            System.out.println("减速");
        }
        //绿灯亮, 就行驶
        if(green){
            System.out.println("通行");
        }

    }
}
