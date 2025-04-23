package Week02;

public class Week02_p109_WhileExample1 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
