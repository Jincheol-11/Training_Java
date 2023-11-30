package GrowUp;

public class Letters {
    public static void main(String[] args) {
        // 문자 a
        // 문자이기에 작은 따옴표
        char a ='닳';

        // 문자열 letter
        // 문자열이기에 큰 따옴표
        String letter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
        // 문자열의 길이를 숫자로 반환
        int letterNumber = letter.length();
        // 닳의 위치 즉 15
        int loc=letter.indexOf(a);
        System.out.printf("\"%s\" => %d자이며, '%c'은 %d번재 있다.\n",
                letter,letterNumber,a,loc);
        // 그렇기에 닳 반환
        char b = letter.charAt(loc);
        System.out.printf("\"%s\"의 %d번째 문자는 '%c'이다.",letter,loc,b);

    }
}
