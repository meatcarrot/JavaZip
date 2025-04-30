package array;
import java.util.ArrayList;

public class Week03_p232_ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Week03_p222_Book> library = new ArrayList<Week03_p222_Book>();

        library.add(new Week03_p222_Book("태백산맥", "조정래"));
        library.add(new Week03_p222_Book("데미안", "헤르만 헤세"));
        library.add(new Week03_p222_Book("어떻게 살 것인가", "유시민"));
        library.add(new Week03_p222_Book("토지", "박경리"));
        library.add(new Week03_p222_Book("어린왕자", "생텍쥐페리"));

        System.out.println("==향상 for문==");
        for(Week03_p222_Book book: library) {
            book.showBookInfo();
        }
    }
}
