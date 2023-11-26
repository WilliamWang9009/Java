public class VariableTest{
	public static void main(String[] args){
		int count = 0;
		//第一站上去一个乘客
		count = count + 1;
		//第二站上去两位乘客, 下去一位乘客
		count = count + 2 - 1;
		//第三站上去两个下来一个
		count = count + 2 - 1;
		//第四站下去一位乘客
		count = count - 1;
		//第五站上去一位乘客
		count = count + 1;
		System.out.println("最后车上一共有" + count + "位乘客");
	}
}