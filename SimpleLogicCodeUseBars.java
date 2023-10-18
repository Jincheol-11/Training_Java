package com.mystudy.run.TrainingJava;

public class SimpleLogicCodeUseBars {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
        // ||는 비트 or 연산자 따라서 ch가 대문자, 소문자, 숫자 라면 b를 환산
        System.out.println(b);
    }
}
