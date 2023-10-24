package com.mystudy.run.TrainingJava;

public class HowToMoreHundred {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0; // true . 조건식의 값이 이므로 무한반복문이 된다
        for(int i=1; true; i++, s=-s) { // 조건식의 값이 true이므로 무한반복문
                                        // s는 1, -1, 1, -1... 를 반복하면서 i는 점차 더해간다.
            num = s * i;                // i 와 s를 조건식에 맞게 계속 곱해주어 num을 구하고 그 num들을 더하여 sum을 구해준다.
            sum += num;
            if(sum >=100) // 총합이 100보다 같거나 크면 반복문을 빠져 나간다
                break;
        }
        System.out.println("num="+num);
        System.out.println("sum="+sum);
    }
}
