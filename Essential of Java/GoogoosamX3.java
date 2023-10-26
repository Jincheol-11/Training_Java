package com.mystudy.run.TrainingJava;

public class GoogoosamX3 {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 9 ; i++) {
            for (int j = 1; j <= 3; j++) { // 이중 for문으로 총 27번 실행
                int x = j+1+(i-1)/3*3; // x는 j와 i를 이용하여 계산, 1부터 3까지 순환하고, 4부터 6, 7부터 9까지 순환.
                int y = i%3==0? 3 : i%3 ; // y는 현재 i 값에 따라 1, 2, 또는 3이 된다.
                if(x > 9) // 10단 이상이 되면 프로그램 종료
                    break;
                System.out.print(x+"*"+y+"="+x*y+"\t"); // \t는 들여쓰기
            }
            System.out.println();
            if(i%3==0) System.out.println();
        }
    } // end of main
} // end of class
