import java.util.Comparator;

public class Week06_p517_05 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        Calc calc = (x, y) -> x + y;
        System.out.println(calc.add(num1, num2));
    }
}
