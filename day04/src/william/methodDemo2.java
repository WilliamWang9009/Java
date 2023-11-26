package william;

public class methodDemo2 {
    //目标: 掌握带参数方法定义的格式和调用格式
    public static void main(String[] args) {
        getSnm(10, 20);


    }

    public static void getSnm(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}
