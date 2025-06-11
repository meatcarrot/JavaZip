package ch5;

class Person {
    String name;
    float height;
    float weight;

    public Person() {}

    public Person(String pname, float pheight, float pweight){
        name = pname;
        height = pheight;
        weight = pweight;
    }
}

public class week03_p174_11 {
    public static void main(String[] args) {
        Person personKim = new Person();
        personKim.name = "김유신";
        personKim.weight = 85.5F;
        personKim.height = 180.0F;

        Person personLee = new Person("이순신", 175, 75);
    }
}
