package textbook;

public class Week01_p89_14 {
    public static void main(String[] args) {

        int n = 5;
        int reverse = ~5;

        System.out.println("원래 값:" + n);
        System.out.println("비트를 반대로 뒤집은 값:" + reverse);
        System.out.println("이진수로 표현한 원래 값:" + Integer.toBinaryString(n));
        System.out.println("이진수로 표현한 뒤집은 값:" + Integer.toBinaryString(reverse));

        // 자바에서 int는 4바이트 -> 32비트이므로 00000000 00000000 00000000 00000101
        System.out.println("🧪 " + Week01_p89_14.class.getSimpleName() + " 실행!");
    }
}
