package textbook.Week06;
import java.util.ArrayList;

public class Week06_p421_04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String str = new String("abc");
        list.add(str);
        String s = list.get(0); // .get(int) : 리스트에서 해당 인덱스의 값을 꺼내올 때 사용

        System.out.println(s);
    }
}

/* ArrayList 제너릭 클래스의 한 부분
public E get(int index) {
    rangeCheck(index); # 인덱스가 유효한지 검사하는 메서드. (예외 발생용)
    return elementData(index); # 내부 배열에서 index 위치의 값을 꺼내오는 메서드
}
*/