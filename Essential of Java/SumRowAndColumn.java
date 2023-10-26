package com.mystudy.run.TrainingJava;

public class SumRowAndColumn {
    public static void main(String[] args) {
        int[][] score = { // score은 2차원 배열을 나타냄, 각 행마다 3개의 열
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        int[][] result = new int[score.length+1][score[0].length+1];
        for(int i=0; i < score.length;i++) {
            for(int j=0; j < score[i].length;j++) {
                result[i][j] = score[i][j];
                result[i][score[0].length] += result[i][j];  // 행의 합 저장 : result[i][score[0].length]
                result[score.length][j] += result[i][j];    // 열의 합 저장 : result[score.length][j]
                result[score.length][score[0].length] += result[i][j]; // 행 및 열의 합 저장
            }
        }
        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.printf("%4d",result[i][j]); // 결과값은 4자리
            }
            System.out.println();
        }
    } // main
}
