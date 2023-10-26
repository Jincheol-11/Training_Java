package TrainingJava;

public class TotalAvgWithArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float average = 0;
        for(int i=0; i < arr.length;i++) { // i와 j가 각각 배열의 길이 만큼 반복함. 즉 arr[0][0]인 5부터 arr[3][4]인 30까지 16번 반복
            for(int j=0; j < arr[i].length;j++) {
                total += arr[i][j]; // 그 수들을 모두 더해주면 325가 나옴
            }
        }
        average = total /(float)(arr.length * arr[0].length); // int로 나누면 정확하게 나오지 않음. 따라서 float로 나눠줌.
//      325/(4*5)
        System.out.println("total="+total);
        System.out.println("average="+average);
    } // end of main
} // end of class
