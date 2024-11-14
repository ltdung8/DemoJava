public class PhuongThuc {
    public double sum;
    public double res;

    //ham k trả về KQ
    public void cong2So(){
        int a =5;
        int b = 10;
        sum = a + b;
        System.out.println("sum = " + sum);
    }

    // Hàm có trả về KQ
    public double nhan2So(){
        int a =5;
        int b = 10;
        res = a * b;
        return res;
    }

    public void loginCRM(){
        System.out.println("Access URL");
        System.out.println("Input Email");
        System.out.println("Input Password");
        System.out.println("Press Enter");
    }
    //hàm có tham số
    public void  tinhTong(int num1, int num2){
        System.out.println( num1 + num2);
    }
    public long nhan3So(int num1, int num2, int num3) {
        return num1*num2*num3;
    }

    public static void main(String[] args) {
        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2So();
        System.out.println(phuongThuc.nhan2So() + 1.12);
        phuongThuc.loginCRM();
        phuongThuc.tinhTong(30, 506);
        System.out.println(phuongThuc.nhan3So(292,3999,195));

    }
}
