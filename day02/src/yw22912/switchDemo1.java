package yw22912;

public class switchDemo1 {
    public static void main(String[] args) {
        //兰州拉面, 武汉热干面, 北京炸酱面, 陕西油泼面
        //1. 定义变量记录我心里想吃的面
        String noodle = "徐小宝的下面";
        switch(noodle){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default :
                System.out.println("吃你的泡面吧!");
                break;

        }
    }
}
