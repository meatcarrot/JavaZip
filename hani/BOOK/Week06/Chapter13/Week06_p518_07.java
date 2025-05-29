import java.util.ArrayList;
import java.util.List;

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class Week06_p518_07 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));

        int totalPrice = bookList.stream().mapToInt(Book::getPrice).sum();
        System.out.println("모든 책 가격 합 : " + totalPrice + "원");
        bookList.stream().filter(b->b.getPrice() >= 20000).map(Book::getName).sorted().forEach(System.out::println);
    }
}
