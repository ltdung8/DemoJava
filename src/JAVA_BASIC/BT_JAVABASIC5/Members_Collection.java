package JAVA_BASIC.BT_JAVABASIC5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Members_Collection {
    public void member(){
        Map<String, String> member = new HashMap<>();
        member.put("name", "LE THI DUNG");
        member.put("age", "26");
        member.put("address", "DA NANG");
        member.put("role", "A Test");
        member.put("salary", "5000$");
        for (Map.Entry<String, String> entry: member.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static List<String> addEmployee(String name, String age, String jobTitle, String add, String exp) {
        List<String> employeeInfor = new ArrayList<>();
        employeeInfor.add(name);
        employeeInfor.add(age);
        employeeInfor.add(jobTitle);
        employeeInfor.add(add);
        employeeInfor.add(exp);

        return employeeInfor;
    }
    public static void main(String[] args) {
        Members_Collection phuongThuc = new Members_Collection();
        System.out.println("***************member**********************");
        phuongThuc.member();

        System.out.println("****************Employee******************");

        List<String> employee = addEmployee(
                "le thi dung",
                "26",
                "A tester",
                "DA NANG",
                "3 years"
        );

        for (String value : employee) {
            System.out.println(value);
        }


    }
}
