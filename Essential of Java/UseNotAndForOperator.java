package com.mystudy.run.TrainingJava;

public class UseNotAndForOperator {
    public static void main(String[] args) {

        int sum = 0;
        for(int i=1; i <=20; i++) {  //for 반복문 - i는 1부터 20까지 계속 증가
            if(i%2!=0 && i%3!=0) //i가 2의 배수가 아니면서 3의 배수가 아니라면 그 수 들을 모두 합해라!
                                // !=의 의미는 not 즉 i%2!=0의 뜻은 i를 2로 나눈 나머지가 0이 아니라면(2의 배수가 아니라면) 이라는 뜻임.
                sum +=i;
        }
        System.out.println("sum="+sum);
    }
}
