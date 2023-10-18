package com.mystudy.run.TrainingJava;

public class isNumberMethodPlay {
    public static boolean isnumber (String str) {
        if(str==null || str.equals(""))
            return false;
        // 유효성 검사 진행, str이 null이거나 빈 문자열이라면 false 반환

        // charAt를 이용하여 문자열에서 한 문자씩 차례대로 읽어와서 char 타입의 변수 ch에 저장한다.
        for(int i=0; i< str.length();i++) {
            char ch = str.charAt(i);
            // 읽어본 문자가 숫자가 아니라면 false 반환
            if(ch < '0' || ch > '9') {
                return false;
            }
        } // for
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isnumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isnumber(str));
    }
}
