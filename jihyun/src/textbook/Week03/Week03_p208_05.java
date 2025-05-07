package textbook.Week03;

public class Week03_p208_05 {
    public static void main(String[] args) {
        Person Kim = new Person("Kim", 4000);
        Person Lee = new Person("Lee", 4500);

        Starbucks Star = new Starbucks("Americano");
        Kim.buyStar(Star);
        Kim.showInfo();
        Star.showInfo();

        KongCoffee Kong = new KongCoffee("Latte");
        Lee.buyKong(Kong);
        Lee.showInfo();
        Kong.showInfo();
    }
}

class Person {
    public String name;
    public int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStar(Starbucks Star){
        Star.take(4000);
        this.money -= 4000;
        System.out.println(name + "씨가 별다방에서 " + Star.menu + "를 구입했습니다.");
    }

    public void buyKong(KongCoffee Kong) {
        Kong.take(4500);
        this.money -= 4500;
        System.out.println(name + "씨가 콩다방에서 " + Kong.menu + "를 구입했습니다.");
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 돈은 " + money + "입니다.");
    }
}

class Starbucks {
    public String menu;
    public int income;

    public Starbucks(String menu) {
        this.menu = menu;
    }

    public void take(int money) {
        this.income = money;
    }

    public void showInfo() {
        System.out.println("별다방 수입은 " + income + "원입니다.");
    }
}

class KongCoffee {
    public String menu;
    public int income;

    public KongCoffee(String menu) {
        this.menu = menu;
    }

    public void take(int money) {
        this.income = money;
    }

    public void showInfo() {
        System.out.println("콩다방 수입은 " + income + "원입니다.");
    }
}

// 김씨 4000원내고 별다방에서 아메리카노
// 이씨 4500원내고 콩다방에서 라떼