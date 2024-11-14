package JAVA_BASIC.BT_JAVABASIC4;

public class EvenNumber {
    public static void main(String[] args) {
        int[] evenNumber = new int[26];
        int index = 0;
        for(int i = 0; i <= 50; i += 2 ){
            System.out.print(i + " ");
            evenNumber[index] = i;
            index++;
        }
        System.out.println(" ");
        System.out.println("Các số chẵn từ 0 đến 50 là: ");
        for (int i : evenNumber){
            System.out.println(i);
        }

    }

}
