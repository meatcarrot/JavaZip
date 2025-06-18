package ch4;

public class test1 {
    public static void main(String[] args) {
        int num1 =10;
        int num2 = 2;
        char operator = '-';
        if (operator == '+') {
            System.out.println(num1 + num2);
        }
        else if(operator=='-'){
            System.out.println(num1 - num2);
        }
        else if(operator=='*'){
            System.out.println(num1 * num2);
        }
        else if(operator=='/'){
            System.out.println(num1 / num2);
        }
        else {
            System.out.println("잘못된 연산자");
            return;
        }
    }
}
