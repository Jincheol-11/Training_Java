package com.mystudy.run.TrainingJava;

public class DetermineStringIsNumberOrNot {
    public static void main(String[] args) {
        String value = "12o34"; // 해당 문자열을 저장
        char ch = ' ';
        boolean isNumber = true; // isnumber: 문자열이 숫자로만 이루어져 있는지를 나타내는 boolean 값
        //  charAt(i): i번째 위치의 문자를 하나하나 검사
        // ch에 value를 통해 charAt(i) 문자를 할당
        for(int i=0; i < value.length() ;i++) {
            ch = value.charAt(i); //
            if(!('0'<=ch && ch<='9')) { // 숫자로만 이루어져 있지 않기에 false값 반환
                isNumber = false;
                break;
            }
        }
        if (isNumber) {
            System.out.println(value+"는 숫자입니다.");
        } else {
            System.out.println(value+"는 숫자가 아닙니다.");
        }
    } // end of main
} // end of class
