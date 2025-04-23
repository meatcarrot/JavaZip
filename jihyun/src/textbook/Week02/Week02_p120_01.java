package textbook.Week02;

public class Week02_p120_01 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;
        char operator = '/';

        if (operator == '+') System.out.println(num1+num2);
        else if (operator == '-') System.out.println(num1-num2);
        else if (operator == '*') System.out.println(num1*num2);
        else System.out.println(num1/num2);

        int result = switch(operator){
            case '+' -> num1+num2;
            case '-' -> num1-num2;
            case '*' -> num1*num2;
            default -> num1/num2;
        };

        System.out.println(result);

        System.out.println("🧪 " + Week02_p120_01.class.getSimpleName() + " 실행!");
    }
}