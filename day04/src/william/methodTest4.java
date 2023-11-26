package william;

public class methodTest4 {
    public static void main(String[] args) {
        double area1 = compare(1.5, 3.7);
        double area2 = compare(2.4, 2.7);

        if (area1 > area2){
            System.out.println("第一个长方形面积更大");
        }else {
            System.out.println("第二个长方形面积更大");
        }

    }

    public static double compare(double len, double width) {
        double area = len * width;

        return area;
    }
}
