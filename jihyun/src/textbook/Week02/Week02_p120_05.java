package textbook.Week02;

public class Week02_p120_05 {
    public static void main(String[] args) {

        for(int i = 0; i < 7; i++){
            if(i <= 3){ // 위쪽 삼각형 피라미드
                for(int j = i; j < 3; j++){
                    System.out.print(" ");
                }
                for(int k = 0; k <= i * 2; k++){
                    System.out.print("*");
                }
            }
            else{ // 아래쪽 삼각형 피라미드 i = 4 부터
                for(int j = 0; j < i - 3; j++){
                    System.out.print(" ");
                }
                for(int k = 0; k <= (6 - i) * 2; k++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        System.out.println("🧪 " + Week02_p120_05.class.getSimpleName() + " 실행!");
    }
}