package innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }
    class InClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스이 인스턴스 변수)");
            System.out.println("OutClass sNum = "+ sNum + "(외부 클래스의 정적 변수)");
            System.out.println("OutClass sInNum = " + sInNum + "(인스턴스 내부 클래스의 정적 변수");
        }

        static void sTest() {
            System.out.println("인스턴스 내부 클래스의 정적 메서드 호출");
        }
    }
    public void usingClass() {
        inClass.inTest();
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();
        System.out.println("인스턴스 내부 클래스 정적 변수 직접 호출 OutClass.InClass.sInNum = " + OutClass.InClass.sInNum);
        OutClass.InClass.sTest();
    }
}
