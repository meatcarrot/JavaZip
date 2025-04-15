package chapter2;

public class DoubleEx1 {
    public static void main(String[] args){     //static = 클래스가 인스턴스화되지 않아도 사용할 수 있다 // void = 어떤 값을 반환해서 쓰는 메서드가 아니기 때문에 void로 선언
        double dnum = 3.14;
        float fnum = 3.14F;     //F는 식별자

        System.out.println(dnum);
        System.out.println(fnum);
    }
}

/* float형은 지수부 8비트 + 가수부 23비트 = 총 32비트(4바이트)
   double형은 지수부 11비트 + 가수부 52비트 = 총 64비트(8바이트)
 */

