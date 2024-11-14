public class XuLyChuoi {
    public static void main(String[] args) {
        //Khai báo chuỗi
        String s1 = "What is Lorem Ipsum?";
        String s2 = "Why do we use it?\n";
        String s3 = " Dung ";

        //Cắt chuỗi
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 15));

        //Ghép chuỗi
        System.out.println(s1 + " " + s2);

        //Chuyển kiểu in hoa in thường
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());

        //Xoá kí tự khoảng trắng 2 đầu
        System.out.println(s3.trim());

        //Độ dài chuỗi
        System.out.println("s1 length =" + s1.length());

        //Tìm kiếm kí tự
        System.out.println(s1.charAt(6));

        //So sánh chuỗi
         //so sánh =
        s3 = s3.trim();
        String expected = "dung";
        System.out.println(s3.equals(expected));

         //so sánh chứa
        System.out.println(s3.contains("D"));

         //So sánh bỏ qua hoa thường:
        System.out.println(s3.equalsIgnoreCase(expected));

        //tìm kiếm vị trí:
        System.out.println(s3.indexOf("D"));
    }
}
