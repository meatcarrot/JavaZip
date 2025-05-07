package textbook.Week03;
import java.util.ArrayList;

public class Week03_p240_05 {
    public static void main(String[] args) {
        ArrayList<Dog_> list = new ArrayList<Dog_>();

        list.add(new Dog_("장미", "푸들"));
        list.add(new Dog_("먹돌이", "시츄"));
        list.add(new Dog_("체리", "포메라니안"));
        list.add(new Dog_("장군이", "진돗개"));
        list.add(new Dog_("덕순이", "시고르자브종"));

        for(Dog_ i : list) {
            System.out.println(i.showDogInfo());
        }
    }
}

class Dog_ {
    private String name;
    private String type;

    public Dog_(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String showDogInfo() {
        return (name + ", " + type);
    }
}