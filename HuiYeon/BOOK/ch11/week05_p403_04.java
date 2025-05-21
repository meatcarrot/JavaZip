package ch11;

class MyDog{
    String name;
    String type;

    MyDog(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return type + " " + name;
    }
}

public class week05_p403_04 {
    public static void main(String[] args) {
        MyDog dog = new MyDog("멍멍이", "진돗개");
        System.out.println(dog);
    }
}
