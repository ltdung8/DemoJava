package JAVA_BASIC.BT_JAVABASIC3;

public class IFELSE {
    static int number = 100;
    public void compare(int n) {
        if (n == number) {
            System.out.println(" số n == 100");
        } else if (n < number) {
            System.out.println(" số n < 100");
        } else {
            System.out.println(" số n > 100");
        }
    }

    public static void main(String[] args) {
        IFELSE phuongThuc = new IFELSE();
        phuongThuc.compare(101);
    }
}
