package interfaceex;

public abstract class Calculator implements Calc {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
