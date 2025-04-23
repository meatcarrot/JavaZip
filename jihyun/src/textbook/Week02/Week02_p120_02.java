package textbook.Week02;

public class Week02_p120_02 {
    public static void main(String[] args) {

        for(int i = 2; i < 10; i++){
            for(int j = 1; j < 10; j++){
                if (i % 2 == 1) continue;

                System.out.println(i + "x" + j + "=" + i*j);
            }
        }

        System.out.println("🧪 " + Week02_p120_02.class.getSimpleName() + " 실행!");
    }
}
