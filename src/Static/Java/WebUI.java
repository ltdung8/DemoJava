package Static.Java;

public class WebUI {
    public  static void openURL(String url){
        System.out.println(url);
    }
    public static void clickElement(String elementName) {
        System.out.println(elementName);
    }
    public static void setText(String text) {
        System.out.println("Set text:" + text);
    }
    public static String getElementText(String elementName){
        System.out.println(elementName);
        return "text";
    }

    public static String url = "https://google.com";
    public static String email = "abc@gmail.com";
    public static String password = "pass123";

    public static void main(String[] args) {
        openURL("https://google.com");
        clickElement("abc");
        setText("text12");
        getElementText("element NAME");

    }
}
