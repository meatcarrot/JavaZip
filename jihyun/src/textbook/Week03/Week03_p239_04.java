package textbook.Week03;

public class Week03_p239_04 {
    public static void main(String[] args) {
        Dog[] dogArray = new Dog[5];

        dogArray[0] = new Dog("장미", "푸들");
        dogArray[1] = new Dog("먹돌이", "시츄");
        dogArray[2] = new Dog("체리", "포메라니안");
        dogArray[3] = new Dog("장군이", "진돗개");
        dogArray[4] = new Dog("덕순이", "시고르자브종");

        for(Dog i : dogArray) {
            System.out.println(i.showDogInfo());
        }
    }
}

class Dog {
    private String name;
    private String type;

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String showDogInfo() {
        return (name + ", " + type);
    }
}