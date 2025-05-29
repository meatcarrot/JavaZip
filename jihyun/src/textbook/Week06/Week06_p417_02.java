package textbook.Week06;

public class Week06_p417_02 {
    public static void main(String[] args) {
        GenericPrinter1<Powder1> powderPrinter = new GenericPrinter1<>();
        powderPrinter.setMaterial(new Powder1());
        powderPrinter.printing();

        GenericPrinter1<Plastic1> plasticPrinter = new GenericPrinter1<>();
        plasticPrinter.setMaterial(new Plastic1());
        plasticPrinter.printing();
    }
}
abstract class Material {
    public abstract void doPrinting();
}

class Powder1 extends Material {
    public String toString() {
        return "재료는 Powder입니다.";
    }

    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다.");
    }
}

class Plastic1 extends Material {
    public String toString() {
        return "재료는 Plastic입니다.";
    }

    public void doPrinting() {
        System.out.println("Plastic 재료로 출력합니다.");
    }
}

class GenericPrinter1<T extends Material> {
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }
}