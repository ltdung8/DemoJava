package JAVA_BASIC.BT_JAVABASIC2;

import java.util.Scanner;

public class Calculator {
    public static int total (int a, int b) {
        return a + b;
    }

    public static double multiplication (double x, double y) {
        return x*y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên a :");
        int a = scanner.nextInt();

        System.out.println("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int total = total(a, b);

        System.out.println("Tổng hai số nguyên a + b là: " + total);

        System.out.println("Nhập số thực x :");
        double x = scanner.nextDouble();

        System.out.println("Nhập số thực y :");
        double y = scanner.nextDouble();

        double multiplication = multiplication(x, y);
        System.out.println("Tích của hai số thực x*y là: " + multiplication);

        scanner.close(); // Đóng scanner khi không sử dụng nữa
    }



}
