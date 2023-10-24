package com.mystudy.run.TrainingJava;

public class ForToWhileThisIsFor {
    public static void main(String[] args) {
//        이중 for문 사용
//        i가 10까지 증가 즉 11행까지 출력 (0~10)
//        그에 맞게 j도 11개 즉 별이 11개까지 출력
        for(int i=0; i<=10; i++) {
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    } // end of main
} // end of class
