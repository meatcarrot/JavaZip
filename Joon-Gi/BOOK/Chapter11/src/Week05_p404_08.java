class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyDate) {
            MyDate myDate = (MyDate)obj;
            if(this.day == myDate.day && this.month == myDate.month && this.year == myDate.year) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.day;
    }
}

public class Week05_p404_08 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(9, 18, 2004);
        MyDate date2 = new MyDate(9, 18, 2004);

        System.out.println(date1.equals(date2));

        System.out.println("date1의 hashCode: " + date1.hashCode());
        System.out.println("date2의 hashCode: " + date2.hashCode());
        System.out.println("date1의 실제 주솟값: " + System.identityHashCode(date1));
        System.out.println("date2의 실제 주솟값: " + System.identityHashCode(date2));
    }
}
