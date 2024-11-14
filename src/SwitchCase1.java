public class SwitchCase1 {
    public static void main(String[] args) {
        int number = 0;
        switch (number){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            case 40:
                System.out.println("40");
                break;
            default:
                System.out.println("không có giá trị");
        }

        String label = " Register ";
        label = label.trim();

        //hàm toLowerCase()
        //hàm toUpperCase()
        //Hàm trim() 2 đầu của String
        switch (label){
            case "Register":
                System.out.println("Register");
                break;
            case "Forgot Password":
                System.out.println("Forgot Password");
                break;
            case "Reset Password":
                System.out.println("Reset Password");
                break;
            case "Login":
                System.out.println("Login");
                break;
            default:
                System.out.println("Home");
        }
    }
}
