package textbook.Week07;

public class Week07_p476_AnonymousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();

        // 메서드 호출하여 반환 값 받아 사용
        Runnable runnable = out.getRunnable(10);
        runnable.run();

        // 익명 클래스 객체를 직접 변수에 저장
        out.runner.run();
    }
}

class Outer2 {
    Runnable getRunnable(int i) {
        int num = 100;

        return new Runnable() { // Runnable 인터페이스 생성
            // 익명 내부 클래스
            @Override
            public void run() {
                System.out.println("i = " + i);
                System.out.println("num = " + num);
            }
        }; // 리턴문 뒤에 세미콜론
        // --> 인터페이스 이용하여 클래스 만들고, 그 클래스를 즉시 new해서 Runnable 타입의 객체 생성 후 반환까지 한 코드
    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    }; // 세미콜론 주의
}