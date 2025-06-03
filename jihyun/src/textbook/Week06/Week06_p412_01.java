package textbook.Week06;

public class Week06_p412_01 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        // Powder형으로 GenericPrinter 클래스 생성

        powderPrinter.setMaterial(new Powder());
        // Powder 객체 생성하여 GenericPrinter 클래스의 멤버 변수에 대입
        System.out.println(powderPrinter);

        Powder powder = powderPrinter.getMaterial();
        // powder는 powderPrinter에 있는 Powder형 material 객체를 가리킴
    }
}

class Powder {
    public String toString() {
        return "재료는 Powder입니다.";
    }
}

class GenericPrinter<T> { // 제네릭 자료형
    private T material; // T는 대입된 자료형

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }

    public T getMaterial() {
        return material;
    }
}