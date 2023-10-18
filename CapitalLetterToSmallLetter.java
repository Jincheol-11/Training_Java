package com.mystudy.run.TrainingJava;

public class CapitalLetterToSmallLetter {
    public static void main(String[] args) {

        char ch = 'A';
        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char) (ch+32) : ch; // 대문자 아스키코드에 32를 더하면 소문자로 변환 가능
                                                                        // 삼중 연산자 사용하여 변환
        System.out.println("ch: " +ch);
        System.out.println("ch tp lowerCase: " +lowerCase);
    }
}
