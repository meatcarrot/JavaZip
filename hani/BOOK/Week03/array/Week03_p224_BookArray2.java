package array;

public class Week03_p224_BookArray2 {
    public static void main(String[] args) {
        Week03_p222_Book[] library = new Week03_p222_Book[5];

        library[0] = new Week03_p222_Book("태백산맥", "조정래");
        library[1] = new Week03_p222_Book("데미안", "헤르만 헤세");
        library[2] = new Week03_p222_Book("어떻게 살 것인가", "유시민");
        library[3] = new Week03_p222_Book("토지", "박경리");
        library[4] = new Week03_p222_Book("어린왕자", "생텍쥐페리");

        for(int i=0;i<library.length; i++) {
            library[i].showBookInfo();
        }
        for (Week03_p222_Book week03P222Book : library) {
            System.out.println(week03P222Book);
        }
    }
}
