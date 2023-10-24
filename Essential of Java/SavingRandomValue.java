package com.mystudy.run.TrainingJava;

public class SavingRandomValue {
    public static void main(String[] args) {
//        1~6중 랜덤으로 숫자 하나를 뽑는 메소드는 Math.random()
        int value = (int)(Math.random()*6)+1;
        System.out.println("value:"+value);
    }
}
