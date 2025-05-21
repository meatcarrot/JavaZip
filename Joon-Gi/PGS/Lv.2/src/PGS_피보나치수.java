import java.math.BigInteger;

public class PGS_피보나치수 {
    public static BigInteger solution(int n) {
        BigInteger answer = BigInteger.ZERO;
        BigInteger fibo = fibonacci(n);
        BigInteger k = new BigInteger("1234567");

        answer = fibo.mod(k);

        return answer;
    }

    // 1. 피보나치 재귀 [X]
//    public static int fibonacci(int i) {
//        if(i<=0) return 0;
//        else if(i==1) return 1;
//        else {
//            return (fibonacci(i-1) + fibonacci(i-2));
//        }
//    }

     // 2. 반복문 재귀 [X]
//     public static int fibonacci(int n) {
//         if (n <= 0) return 0;
//         if (n == 1) return 1;
//
//         int fib1 = 0;
//         int fib2 = 1;
//         int result = 0;
//
//         for (int i = 2; i <= n; i++) {
//             result = fib1 + fib2;
//             fib1 = fib2;
//             fib2 = result;
//         }
//
//         return result;
//     }

    // 3. BigInteger 반복문
    public static BigInteger fibonacci(int n) {
        if (n <= 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        BigInteger fib1 = BigInteger.ZERO;
        BigInteger fib2 = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;

        for (int i = 2; i <= n; i++) {
            result = fib1.add(fib2);
            fib1 = fib2;
            fib2 = result;
        }

        return result;
    }

    public static void main(String[] args) {
        BigInteger s = solution(95034);

        System.out.println("answer: " + s);
    }
}
