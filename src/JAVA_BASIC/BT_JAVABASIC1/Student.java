package JAVA_BASIC.BT_JAVABASIC1;

public class Student {
    // biến static
    static String Name = "Dung";
    // biến instance
    int Age = 26;
    public static void main(String[] args) {
        // biến local
        String Major = "IT";
        int Grade = 2;
        //gõ sout
        System.out.println("JAVABASIC.TEST.BT_JAVABASIC1.Student information: ");
        System.out.println("Name:  " + Name);
        //cách để gọi 1 thành phần trong 1 calss vào hàm bất kì: khai báo đối tượng class: tên class + tên đối tượng = new tên class()
        Student student = new Student();

        System.out.println("Age:  " + student.Age);
        System.out.println("Major:  " + Major);
        System.out.println("Grade:  " + Grade);
        System.out.println("tuition:  " + StudentInformation.tuition);
        System.out.println("Full name: " + StudentInformation.fullName);


        //ctrl + alt + L => Format lại
    }
}
