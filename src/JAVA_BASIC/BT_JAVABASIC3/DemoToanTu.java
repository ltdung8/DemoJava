package JAVA_BASIC.BT_JAVABASIC3;

public class DemoToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        System.out.println("a = " + a);
        System.out.println("a + b = " + (a + b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a + 1000 = " + (a + 1000));
        System.out.println("a + 5 = " + (a + 5));
        System.out.println((a > b) && (a > c));
        System.out.println((a <= b) && (a >= c));
        c = 12;
        System.out.println(a > c);
        System.out.println(a);
        System.out.println(a != b);
        System.out.println(c > 0 || a < 0);
    }

}
