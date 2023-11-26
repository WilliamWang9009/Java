import java.util.Scanner;
//第一步, 导包
public class ScannerDemo{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//第二步, 创建对象
		System.out.println("请输入整数:");
		int i = sc.nextInt();
		//第三步, 接收数据, 变量i记录了键盘录入的数据
		System.out.println();
	}
}