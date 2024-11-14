package IFELSE;

public class DemoIFELSEIF {
    public static void main(String[] args) {
        double dtb = 9.75;
        if (dtb > 10 || dtb < 0) {
            System.out.println("Không hợp lệ");
        } else {

            if (dtb >= 8) {
                System.out.println("Giỏi");
            } else if (dtb < 8 && dtb >= 6.5) {
                System.out.println("Khá");
            } else if (dtb < 6.5 && dtb > 5) {
                System.out.println("Trung Bình");
            } else {
                System.out.println("Yếu");
            }
        }
    }
}
//ngoài ra có thể bẫy lỗi bằng try catch
