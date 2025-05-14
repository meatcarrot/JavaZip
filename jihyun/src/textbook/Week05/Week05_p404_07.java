package textbook.Week05;

public class Week05_p404_07 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2004, 9, 18);
        MyDate date2 = new MyDate(2004, 9, 18);

        System.out.println(date1.equals(date2));

        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
    }
}

class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean equals(Object obj) {
        if(obj instanceof MyDate) {
            MyDate date = (MyDate)obj; // 다운캐스팅

            if(this.year == date.year && this.month == date.month && this.day == date.day)
                return true;
            else
                return false;
        }
        return false;
    }

    public int hashCode() {
        return year*10000 + month*100 + day;
    }
}