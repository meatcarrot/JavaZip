package textbook.Week02;

public class Week02_p174_11 {
    public static void main(String[] args) {
        Person person = new Person("Kim", 178.7f, 75.2f);

        person.personInfo();
    }
}
//이름 키 몸무게 매개변수
class Person {
    private String name;
    private float height;
    private float weight;

    public Person(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void personInfo(){
        System.out.println("이름은 " + name + ", 키는 " + height + ", 몸무게는 " + weight + "입니다.");
    }
}