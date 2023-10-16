package com.mystudy.run.TrainingJava;

public class absMethodPlay {
    public static int abs(int value) { //양수라면 그대로 반환, 음수라면 부호를 바꿔서 반환
        return value >= 0 ? value : -value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값:" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값:" + abs(value));
    }
}
