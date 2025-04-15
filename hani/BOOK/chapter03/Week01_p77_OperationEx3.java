package chapter03;

public class Week01_p77_OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);  // 논리곱에서 앞 항이 거짓이므로 실행되지 않아 그대로

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); // 논리합에서 앞 항이 참이면 뒤가 실행되지 않아 그대로
    }
}
