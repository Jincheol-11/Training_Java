package TrainingJava;

public class Training1 {
    public static void main(String[] args) {
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기 (바구니 하나에 담을 수 있는 사과의 개수)
        int numOfBucket =
                numOfApples/sizeOfBucket + ((numOfApples%sizeOfBucket > 0) ? 1 : 0); //삼항연산자의 에티켓: ? 앞은 괄호로 묶어준다.
        System.out.println("필요한 바구니의 수 :" + numOfBucket);
    }
}
