import java.util.ArrayList;
import java.util.List;

public class Week06_p518_07 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));

        // 모든 책 가격의 합
        int sum = bookList.stream().mapToInt(p -> p.getPrice()).sum();
        System.out.println("모든 책 가격의 합: " + sum);

        // 가격이 20,000원 이상인 책의 이름
        bookList.stream().filter(s -> s.getPrice() >= 20000)
                .map(s -> s.getName()).sorted()
                .forEach(s -> System.out.print(s + " "));
    }
}
