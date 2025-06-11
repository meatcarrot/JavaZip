package ch13;

@FunctionalInterface
interface Calc {

    public int add(int num1, int num2);
}

public class week06_p517_05 {
    public static void main(String[] args) {

        Calc sum = (x,y)->x + y;

        System.out.println(sum.add(20,  30));
    }
}
