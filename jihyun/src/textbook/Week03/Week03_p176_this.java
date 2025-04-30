package textbook.Week03;

public class Week03_p176_this {
    public static void main(String[] args) {
        BirthDay bDay = new BirthDay();
        bDay.setYear(2000);
        System.out.println(bDay);
        bDay.printThis();
    }

    static class BirthDay {
        int day;
        int month;
        int year;

        public void setYear(int year) {
            this.year = year;
        }

        public void printThis() {
            System.out.println(this);
        }
    }
}