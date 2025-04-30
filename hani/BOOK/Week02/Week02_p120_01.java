package Week02;

public class Week02_p120_01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '+';

        switch (operator) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
        }
    }
}
