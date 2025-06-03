package textbook.Week05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Week05_p404_09 {
    public static void main(String[] args) throws ClassNotFoundException{
        System.out.println("========== 클래스 이름 가져오기 ==========");
        Class strPerson = Class.forName("java.lang.String"); // 클래스 이름으로 가져오기
        System.out.println(strPerson);

        System.out.println("========== 모든 생성자 가져오기 ==========");
        Constructor[] cons = strPerson.getConstructors(); // 모든 생성자 가져오기
        for (Constructor c : cons) {
            System.out.println(c);
        }

        System.out.println("========== 모든 인스턴스 필드 가져오기 ==========");
        Field[] fields = strPerson.getFields(); // 모든 인스턴스 필드 가져오기
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println("========== 모든 메서드 가져오기 ==========");
        Method[] methods = strPerson.getMethods(); // 모든 메서드 가져오기
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}