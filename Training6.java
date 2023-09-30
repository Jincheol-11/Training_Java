package TrainingJava;

public class Training6 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i <=20; i++) {
            if(i%2!=0 && i%3!=0) //i 2 3 sum i . 가 또는 의 배수가 아닐 때만 에 를 더한다
                sum +=i;
        }
        System.out.println("sum="+sum);
    } // main
}
