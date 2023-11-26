package william;

public class whileTest1 {
    //折叠纸张
    public static void main(String[] args) {
        double i = 0.1;
        double mountain = 8844430;
        int count = 0;
        while (i <= mountain){
            i *= 2;
            System.out.println(i);
            count++;
        }
        System.out.println(count);
    }
}
