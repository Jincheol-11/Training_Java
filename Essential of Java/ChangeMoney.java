package TrainingJava;

public class ChangeMoney {
    public static void main(String[] args) {
//  큰 금액의 동전을 우선적으로 거슬러 줘야함.
        int[] coinUnit = {500, 100, 50, 10};
        int money = 2680;
        System.out.println("money="+money);
        for(int i=0;i<coinUnit.length;i++) { //i는 배열의 길이만큼 총 4번 반복
            System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);  //  coinUnit[i]: 처음에 500부터 시작. 나눗셈 활용하면 해당 동전이 몇 개 필요한지 알 수 있음.
                    money = money%coinUnit[i]; // 10원까지 반복
        }
    } // main
}
