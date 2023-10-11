package com.mystudy.run.TrainingJava;

public class ShiffleMethodPratice {
    public static int[] shuffle(int[] arr) {
        if(arr==null || arr.length==0)
            return arr; //넘겨받은 배열이 null이거나 크기가 0이면 그대로 반환

        for(int i=0; i< arr.length;i++) {
            int j = (int)(Math.random()*arr.length);

// arr[i]와 arr[j]의 값을 서로 바꾼다.
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        //1 ~ 9를 한 번씩 넣고 결과값은 shuffle한 값을 얻음
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
