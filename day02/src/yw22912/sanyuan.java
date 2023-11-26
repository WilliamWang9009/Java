package yw22912;

public class sanyuan {
    public static void main(String[] args) {
        //三元表达式的格式: 关系表达式?表达式1:表达式2
        //使用三元表达式, 获取两个数的较大值

        //1.定义开两个变量记录两个整数
        int number1 = 10;
        int number2 = 20;
        //2.获取两个整数的较大值
        int max = number1 > number2 ? number1 :number2;
        System.out.println(max);
    }
}
