package com.mystudy.run.TrainingJava;

public class AddOnePlusOneTwoPlusOneTwoThreeToTen {
    public static void main(String[] args) {

        int sum = 0;
        int totalSum = 0;
        for(int i=1; i <=10; i++) {
            sum += i;     //i를 1씩 점차 더하여 10까지 도달 (1 3 6 10.....)
            totalSum += sum; // 위의 sum들을 더하여 값을 환산
        }
        System.out.println("totalSum="+totalSum);
    }
}
