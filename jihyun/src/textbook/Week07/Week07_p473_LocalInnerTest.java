package textbook.Week07;

public class Week07_p473_LocalInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer(); // 외부 클래스 객체 생성
        Runnable runner = out.getRunnable(10); // MyRunnable() 객체 리턴
        runner.run(); // MyRunnable의 run()메서드 실행
    }
}

class Outer {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100;

        class MyRunnable implements Runnable {
            int localNum = 10;

            @Override
            public void run() {
                // num = 200;
                // i = 100;
                // 지역 내부 클래스는 외부 메서드 안의 변수 값 변경 불가 (final로 간주, 상수로 처리)

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);
                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수");
                System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
        }

        return new MyRunnable();
    }
}