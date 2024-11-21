package JAVA1.Arrays;

public class DemoArray {
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        System.out.println(min);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // khai báo và khởi tạo mảng
        int a[] = new int[3];
        a[0] = 10; // gán giá trị
        a[1] = 20;
        a[2] = 50;

        // in mảng ra màn hình
        for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
        }

        // TODO Auto-generated method stub
        // gán mảng nặc danh cho mảng a
        int a1[] = { 33, 3, 4, 5 };

        // in mảng a ra màn hình
        for (int i = 0; i < a.length; i++)
            System.out.print(a1[i] + " ");

        // TODO Auto-generated method stub
        int a2[] = { 33, 3, 4, 5 };
        min(a2);// truyền mảng tới phương thức
    }
}
