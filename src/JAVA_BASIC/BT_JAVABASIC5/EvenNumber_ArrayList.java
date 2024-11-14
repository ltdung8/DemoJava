package JAVA_BASIC.BT_JAVABASIC5;

import java.util.ArrayList;
import java.util.List;

public class EvenNumber_ArrayList {
    public void member() {
    }

    public static void main(String[] args) {
        List<Integer> evenNumber = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("số chẵn là: " + i);
                evenNumber.add(i);
            }
        }
        System.out.println("Các số chẳn trong ArrayList là: " + evenNumber);
    }
}
