package textbook.Week03;

public class Week03_p209_08 {
    public static void main(String[] args) {
        Passenger Edward = new Passenger("Edward", 30000);
        Passenger Scalet = new Passenger("Scalet", 2000);

        Taxi taxi = new Taxi();
        Subway subway = new Subway();
        Scalet.takeTaxi(taxi);
        Scalet.takeSubway(subway);
        Edward.takeTaxi(taxi);
    }
}

class Passenger  {
    private String name;
    private int money;

    public Passenger (String name, int money) {
        this.name = name;
        this.money = money;
        System.out.println(name + "님의 현재 보유 금액은 " + money + "원입니다.");
    }

    public void takeTaxi(Taxi taxi){
        System.out.print(name + "님");
        money = taxi.take(money);
        System.out.println(name + "님의 현재 잔액은 " + money + "원입니다.");
    }

    public void takeSubway(Subway subway) {
        System.out.print(name + "님");
        money = subway.take(money);
        System.out.println(name + "님의 현재 잔액은 " + money + "원입니다.");
    }
}

class Taxi {
    public int price = 10000;

    public int take(int money) {
        if(money >= 10000) {
            System.out.println("이 택시에 탑승하셨습니다. 요금은 10000원입니다.");
            return (money - 10000);
        }
        else {
            System.out.println("의 잔액이 부족하여 택시에 탑승 실패하였습니다.");
            return money;
        }
    }

}

class Subway {
    public int price = 1500;

    public int take(int money) {
        if(money >= 1500) {
            System.out.println("이 지하철에 탑승하셨습니다. 요금은 1500원입니다.");
            return (money - 1500);
        }
        else {
            System.out.println("의 잔액이 부족하여 지하철에 탑승 실패하였습니다.");
            return money;
        }
    }
}