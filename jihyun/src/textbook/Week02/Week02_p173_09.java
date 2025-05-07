package textbook.Week02;

public class Week02_p173_09 {
    public static void main(String[] args) {
        Man James = new Man(40, "James", true, 3);

        James.ManInfo();
    }
}

class Man {
    private int age;
    private String name;
    private boolean married;
    private int child;

    public Man(int age, String name, boolean married, int child){
        this.age = age;
        this.name = name;
        this.married = married;
        this.child = child;
    }

    public void ManInfo() {
        System.out.println("나이가 " + age + "살, 이름이 " + name + "이라는 남자가 있습니다. 이 남자는 결혼 여부가 " + married + "이고, 자식이 " + child + "명 있습니다.");
    }
}