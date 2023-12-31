package GrowUp;

// 사용자 정의 클래스
class JLocation{
    public double lat;
    public double lng;
}

public class JavaUserDefinedType {
    public static void main(String[] args) {
        // 두 개의 기본 타입
        double latitude=37.52127220511242;
        double longtitude= 123.0074462890625;
        // 사용자 정의 객체를 생성
        JLocation jloc = new JLocation();
        jloc.lat=latitude; // 값 대입
        jloc.lng=longtitude; // 값 대입

        JLocation newLoc = jloc; // 객체 대입
        System.out.println(newLoc.lat);
        System.out.println(newLoc.lng);
    }
}
