package com.mystudy.run.TrainingJava;

public class Fibonnaci {
    public static void main(String[] args) {
        // Fibonnaci 수열의 시작은 첫 두 숫자를 1, 1로 함
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세번째 값
        System.out.print(num1+", "+num2);
        for (int i = 0 ; i < 8 ; i++ ) { // 시작 숫자 두 개를 제외하고 여럷 번째 수열까지 계산 (0~7)
            num3 = num1 + num2; // 세번째 값은 첫 번째와 두 번째 값을 더해서 얻음.
            System.out.print(", "+num3); // 세 번째 수열 출력
            num1 = num2; // 두 번째 수열을 첫 번째 값으로 함.
            num2 = num3; // 세 번째 수열을 두 번째 값으로 함.
        }
    } // end of main
} // end of class
