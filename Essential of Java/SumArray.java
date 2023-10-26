package TrainingJava;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i=0;i<arr.length;i++) { // i는 배열의 길이만큼 반복. 즉 10, 20, 30, 40, 50
            sum += arr[i]; // 배열의 길이를 모두 합하기
        }
        System.out.println("sum="+sum);
    }
}
