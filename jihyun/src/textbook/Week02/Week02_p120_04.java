package textbook.Week02;

public class Week02_p120_04 {
    public static void main(String[] args) {

        for(int i = 0; i < 4; i++){
            for(int j = i; j < 3; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i * 2; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("🧪 " + Week02_p120_04.class.getSimpleName() + " 실행!");
    }
}
