package Static.Java;

public class Login {
    public static void main(String[] args) {
        System.out.println(WebUI.email);
        System.out.println(WebUI.password);
        System.out.println(WebUI.url);
        WebUI.getElementText("LoginTitle");
        WebUI.setText("Error message");
        WebUI.openURL("https://google.com");
    }

}
