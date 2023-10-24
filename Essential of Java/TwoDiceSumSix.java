package com.mystudy.run.TrainingJava;

public class TwoDiceSumSix {
    public static void main(String[] args) {
//        i와 j 모두 6이 될 때까지 반복
        for(int i=1;i<=6;i++)
            for(int j=1;j<=6;j++)
                //        두 변수의 합이 6이 될 때에만 출력
                if(i+j==6)
                    System.out.println(i+"+"+j+"="+(i+j));
    } // main
}
