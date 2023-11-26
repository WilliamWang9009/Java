package yw22912;

public class logic {
    public static void main(String[] args) {
        //1. &且
        //真真则真, 有假则假
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        //2. |或
        //有真则真, 全假则假
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);
        //3. ^异或
        //相同为false, 不同为true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        //4. !非, 取反
        //要么不写, 要么只写一次
        System.out.println(!false);
        System.out.println(!true);
        //5. &&
        //两边都为真, 结果才为真
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        //6. ||短路或
        //两边都为假, 结果才是假
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(true || false);
    }
}
