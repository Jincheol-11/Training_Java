package GrowUp;

public class PointCal {
    public static void main(String[] args) {
        int kor=90;
        int eng=80;
        int math=89;
        int tot=kor + eng + math;
        // 평균을 구할 때에는 int 였던 수들을 실수로 표현
        // 따라서 double로 변경
        double average = (double) tot/3;
        System.out.println("총 점수: " + tot);
        System.out.println("평균: " + average);
    }
}
