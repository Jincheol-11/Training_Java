package GrowUp;

public class PointArray {
    public static void main(String[] args) {
        int[]grade={90, 50, 88}; // grade 메서드의 배열
        int tot = grade[0] + grade[1] + grade[2]; // 순서대로 값을 불러옴
        double average = (double) tot/3;

        System.out.println("총 점수 : " + tot);
        System.out.println("평균 : " + average);
    }
}
