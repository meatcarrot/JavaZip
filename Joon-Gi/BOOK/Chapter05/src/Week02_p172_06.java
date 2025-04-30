class MyDate {
    private int day;
    private int month;
    private int year;

    MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isVaild() {
         if(this.month < 1 || month > 12) {
             System.out.println("유효하지 않은 날짜입니다.");
             return false;
         }
         if(this.day < 1) {
             System.out.println("유효하지 않은 날짜입니다.");
             return false;
         }

         int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

         boolean yoonYear = ((this.year % 400 == 0) && (this.year % 100 != 0)) || this.year % 400 == 0;
         if(yoonYear) {
             daysInMonth[1] = 29;
         }
         if(day > daysInMonth[this.month - 1]) {
             System.out.println("유효하지 않은 날짜입니다.");
             return false;
         }

         System.out.println("유효한 날짜입니다.");
         return true;
    }
}

public class Week02_p172_06 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1.isVaild());
        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2.isVaild());
    }
}
