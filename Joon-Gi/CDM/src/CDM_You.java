import java.util.Scanner;

public class CDM_You {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("You")) {
            System.out.println("Me");
        } else {
            System.out.println("No");
        }
        /*
        * input == "You" 가 아니라 input.equals("You")를 써야하는 이유
        * 자바에서 문자열을 비교할 때 == 연산자와 equals() 메소드는 완전히 다른 방식으로 동작함
        * == 연산자: 객체의 주소값(참조값)을 비교.
        * 즉, 두 문자열 변수가 메모리에서 정확히 같은 객체를 가리키고 있는지 확인한다.
        * equals() 메소드: 객체의 내용(값)을 비교.
        * 문자열의 실제 내용이 같은지 문자 하나하나를 비교하여 판단한다.
        *
        * nextLine()으로 입력받은 문자열은 새 String 객체로 Heap 영역에 생성됨 - 같은 내용이라도 매번 새로운 객체가 생성됨
        * "You"라는 '리터럴'은 String 상수 풀이라는 특별하나 메모리 영역에 저장됨 - 같은 내용의 문자열 리터럴은 풀에서 재사용됨
        * 따라서, 두 문자열은 내용은 같지만 서로 다른 메모리 주소에 위치하므로 == 연산자로 비교하면 false가 된다
        * */

        scanner.close();
    }
}
