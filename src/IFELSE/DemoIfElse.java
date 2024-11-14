package IFELSE;

public class DemoIfElse {
    public static void main(String[] args) {
        int age = 20;
        String address = "Quang Nam";
        String unit = "Quan Khu 5";

        if (age > 18 && address.equals("Da Nang")) {
            System.out.println("Đi NVQS 2024");
        } else if (age > 18 && address.equals("Quang Nam")) {
            System.out.println("Ở nhà đi học Duy Tân U");
        } else {
            System.out.println("Đi học đại học");
        }
        if (unit.contains("5")) {
            System.out.println("Đi NVQS Thuộc địa phận Đà Nẵng");
        }
    }
}
