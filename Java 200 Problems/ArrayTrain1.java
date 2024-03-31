package jinJava;

import java.util.Scanner;

public class ArrayTrain1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] number = new int[5];

        System.out.println("5개 정수 입력");
        for (int i = 0; i < 5; i++) {
            number[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i < number.length -1) {
                System.out.print(", ");
            }
        }
    }
}
