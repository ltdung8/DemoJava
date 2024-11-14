package JAVA_BASIC.BT_JAVABASIC1;

public class StudentInformation {
//- Class ThongTin: khai báo các biến static để gọi lại ở class SinhVien và in ra thông tin
    public static int tuition = 5000000;
    public static String fullName = "LE THI DUNG";

    public static void main(String[] args) {
        System.out.println("Full Name: " + fullName);
        System.out.println("Tuition: " + StudentInformation.tuition);
    }
}