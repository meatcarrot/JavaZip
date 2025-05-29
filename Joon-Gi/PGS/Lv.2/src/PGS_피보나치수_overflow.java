public class PGS_피보나치수_overflow {
    public static long solution(int n) {
        long answer = 0L;
        long fibo = fibonacci(n);

        answer = fibo % 1234567;

        return answer;
    }

    // 1. 피보나치 재귀 [X]
    public static long fibonacci(long i) {
        if(i<=0) return 0;
        else if(i==1) return 1;
        else {
            return (fibonacci(i-1) + fibonacci(i-2));
        }
    }

     // 2. 반복문 재귀 [X]
     public static int fibonacci2(int n) {
         if (n <= 0) return 0;
         if (n == 1) return 1;

         int fib1 = 0;
         int fib2 = 1;
         int result = 0;

         for (int i = 2; i <= n; i++) {
             result = fib1 + fib2;
             fib1 = fib2;
             fib2 = result;
         }

         return result;
     }

    public static void main(String[] args) {
        long s = solution(95034);

        System.out.println("answer: " + s);
    }
}
