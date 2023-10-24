package com.mystudy.run.TrainingJava;

public class LinearEquation {
    public static void main(String[] args) {
//        x 및 y의 범위
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
//                방정식의 해를 구하기 위한 식
                if (2 * x + 4 * y == 10) {
                    System.out.println("x=" + x + ", y=" + y);
                }
            }
        } // main
    }
}
