package ch6;

class Star {
    int money;
    public String buy(int money){
        if (money >= 4000) {
            this.money += 4000;
            return "별다방 아메리카노 구매. 거스름돈: "  + (money-4000);
        } else {
            return "금액 부족";
        }
    }
}

class Kong {
    int money;
    public String buy(int money){
        if (money >= 4500) {
            this.money += 4500;
            return "콩다방 아메리카노 구매. 거스름돈: " + (money-4500);
        } else {
            return "금액 부족";
        }
    }
}

class Person {
    String name;
    int money;
    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }
}

public class week03_p208_05 {
    public static void main(String[] args) {
        Person kim = new Person("kim", 5000);
        Person lee = new Person("Lee", 8000);
        Star star = new Star();
        Kong kong = new Kong();

        System.out.println(star.buy(kim.money));
        System.out.println(kong.buy(lee.money));
    }
}
