package com.mystudy.run.TrainingJava;

public class GuessNumber {
    public static void main(String[] args) {
// 1~100 사이의 임의의 값을 얻어서 answer에 저장
        int answer = (int)(Math.random()*100) + 1;
        int input = 0; // 사용자 입력값 저장하는 곳을 초기화
        int count = 0; // 시도 횟수 초기화
// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
        java.util.Scanner s= new java.util.Scanner(System.in);
//        do - while 사용자가 숫자를 맞힐 때까지 반복
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 :");
            input = s.nextInt(); // 입력받은 값을 변수 input에 저장
            if(answer > input) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if(answer < input) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 "+count+" 번입니다.");
                break;
            }
        } while(true); // 무한반복
    }
}
