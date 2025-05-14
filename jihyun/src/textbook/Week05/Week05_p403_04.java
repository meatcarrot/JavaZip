package textbook.Week05;

public class Week05_p403_04 {
    public static void main(String[] args) {
        MyDog dog = new MyDog("멍멍이", "진돗개");
        System.out.println(dog);
    }
}

class MyDog {
    String name;
    String type;

    public MyDog(String name, String Type) {
        this.name = name;
        this.type = Type;
    }

    public String toString() {
        return type + " " + name;
    }
}