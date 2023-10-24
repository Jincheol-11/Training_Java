package com.mystudy.run.TrainingJava;

public class ForToWhileThisIsWhile {
    public static void main(String[] args) {
//        이중 while문 실행
//        i를 0부터 10까지 즉 11행 실행
//      그러면 j 즉 별 갯수도 행에 맞게 출력
        int i=0;
        while( i<=10) {
            int j=0;
            while(j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    } // end of main
} // end of class
