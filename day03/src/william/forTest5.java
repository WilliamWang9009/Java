package william;

import java.util.Scanner;

public class forTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个整数:");
        int number1 = sc.nextInt();
        System.out.println("输入第二个整数:");
        int number2 = sc.nextInt();
        //统计变量
        int count = 0;

        for(int i = number1; i <= number2; i++ ){
            if(i % 3 ==0 && i % 5 ==0){
                count++;
            }
//            System.out.println(count);

        }
        System.out.println(count);
    }
}
