import java.util.*;

class Person {
    private String personName;
    private int money;

    // 생성자
    public Person(String personName, int money) {
        this.personName = personName;
        this.money = money;
    }

    // 커피 주문
    public void takeCoffee(Cafe cafe, Menu menu) {
        int price = menu.getPrice();
        this.money -= price;
        String menuName = menu.getMenuName();
        String cafeName = cafe.getCafeName();

        System.out.println(personName + "님이 " + cafeName + "에서 " + menuName + "를 주문하셨습니다.");
    }

    // 잔돈 보여주기
    public void showInfo() {
        System.out.println(personName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}

class Cafe {
    private String cafeName;
    private int money = 0;
    private List<Menu> menuList = new ArrayList<>();

    // 생성자
    public Cafe(String name) {
        this.cafeName = name;
    }

    // 생성자 오버로딩
    public Cafe(String name, int money) {
        this.cafeName = name;
        this.money = money;
    }

    public String getCafeName() {
        return cafeName;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    // 메뉴 추가
    public void addMenu(Menu menu) {
        menuList.add(menu);
    }
}

class Menu {
    private String menuName;
    private int price;

    // 생성자
    public Menu(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getPrice() {
        return price;
    }
}

public class Week03_p208_04 {
    public static void main(String[] args) {
        Menu americano = new Menu("아메리카노", 4000);
        Menu latte = new Menu("라떼", 4500);

        Cafe starbucks = new Cafe("별다방");
        Cafe kong = new Cafe("콩다방");

        starbucks.addMenu(americano);
        starbucks.addMenu(latte);
        kong.addMenu(americano);
        kong.addMenu(latte);

        Person kim = new Person("김 씨", 10000);
        Person lee = new Person("이 씨", 15000);

        kim.takeCoffee(starbucks, americano);
        kim.showInfo();

        lee.takeCoffee(kong, latte);
        lee.showInfo();
    }
}
