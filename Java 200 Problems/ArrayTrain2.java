package jinJava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ArrayTrain2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수 입력: ");
        int studentCount = scanner.nextInt();

        int[][] score = new int[studentCount][3];

        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요.: ");
            for (int j = 0; j < subject.length; j++) {
                System.out.println(subject[j] + " 점수: ");
                score[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i <studentCount ; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += score[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
