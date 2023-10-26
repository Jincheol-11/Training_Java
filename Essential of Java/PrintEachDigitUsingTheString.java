package com.mystudy.run.TrainingJava;

public class PrintEachDigitUsingTheString {
    public static void main(String[] args) {
        String str = "12345"; //문자열은 12345
        int sum = 0;
//        for문: i가 0부터 문자열 길이까지 증가
//        str.length(): 문자열의 길이만큼 반환
        for(int i=0; i < str.length(); i++) {
//        charAt(i) = i번째 문자 반환
//        즉 str.charAt(0)=1 str.charAt(1)=2 .....
            sum += str.charAt(i) - '0';
        }
        System.out.println("sum="+sum);
    }
}