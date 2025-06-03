package textbook.Week06;

public class Week06_p419_03 {
    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<>(0, 0.0); // 제네릭 클래스 생성
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        double rect = GenericMethod.makeRectangle(p1, p2);
        // GenericMethod.<Integer, Double>makeRectangle(p1, p2); 와 동일함
        System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
    }
}

class Point<T, V> {
    T x;
    V y;

    Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}

class GenericMethod {
    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
        double left = ((Number)p1.getX()).doubleValue();
        // .doubleValue() : Number에 정의된 메서드. 어떤 숫자든 double로 바꿔줌.
        // int, float, double은 기본 자료형(primitive type)이고, Number에 포함되지 않음
        // 래퍼클래스(기본 자료형을 객체처럼 사용할 수 있게 값을 감싼 객체)가 Number의 자식 클래스에 포함됨
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();
        // 제네릭 타입에는 .doubleValue() 메서드를 직접 호출할 수 없음.
        // T와 V가 어떤 클래스인지 모르기 때문에, doubleValue()라는 메서드가 존재하는지 보장 못해서 컴파일 에러 뜸
        // Number는 모든 숫자 타입 래퍼 클래스의 부모 클래스이기 때문에, Number로 업캐스팅 후 메서드 실행
        // 제네릭은 객체 타입만 받을 수 있음 ex) List<Integer> list = new ArrayList<>();
        // 래퍼 클래스 --> Integer, Double, Float, Boolean, Character, Long, Short, Byte

        double width = right - left;
        double height = bottom - top;

        return width * height;
        // public static <T, V> double makeRectangle에서 반환형은 double임.
        // <T, V>는 메서드에서 제네릭 타입을 사용할 것이라는 매개변수 선언부.
        // 클래스 자체가 제네릭일 경우, 클래스 선언부에 이미 선언되어 있기 때문에 메서드에서 <> 선언 필요 없음
        // 클래스에 제네릭 타입이 없고, 메서드 자체에서 제네릭을 쓰고 싶으면 메서드 선언부에서 직접 <>를 선언해야 함.
        // static 메서드는 인스턴스 변수나 클래스의 제네릭 타입을 쓸 수 없음. (static은 클래스 수준이고, 클래스 제네릭에 접근 불가하므로)
        // 그렇기 때문에, static 메서드에서 제네릭을 쓰려면, 그 메서드 선언부에서도 반드시 <>를 직접 선언해주어야 함.
    }
}