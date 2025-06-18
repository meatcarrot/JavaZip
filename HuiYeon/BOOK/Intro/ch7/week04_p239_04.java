package ch7;

class Dog {
    private String name;
    private String type;

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String showDogInfo() {
        return name + ", " + type;
    }
}

public class week04_p239_04 {
    public static void main(String[] args) {
        Dog[] DogList = new Dog[5];
        DogList[0] = new Dog("골댕이", "골든리트리버");
        DogList[1] = new Dog("골멍이", "골든리트리버");
        DogList[2] = new Dog("골골이", "골든리트리버");
        DogList[3] = new Dog("뼈다귀", "골든리트리버");
        DogList[4] = new Dog("감자탕", "골든리트리버");

        for(int i=0;i < DogList.length; i++){
            System.out.println(DogList[i].showDogInfo());
        }
        for (Dog Dog : DogList){
            System.out.println(Dog.showDogInfo());
        }

    }
}
