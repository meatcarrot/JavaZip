package textbook.Week02;

public class Week02_p120_03 {
    public static void main(String[] args) {

        for(int i = 2; i < 10; i++){
            for (int j = 1; i < 10; j++){
                if(i < j) break;
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println();
        }

        System.out.println("🧪 " + Week02_p120_03.class.getSimpleName() + " 실행!");
    }
}
