import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Week05_p404_09 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class pClass = Person.class;

        Constructor[] cons = pClass.getConstructors();
        for(Constructor c : cons) {
            System.out.println(c);
        }
        System.out.println();

        Method[] methods = pClass.getMethods();
        for(Method m : methods) {
            System.out.println(m);
        }
        System.out.println();

        Field[] fields = pClass.getFields();
        for(Field f : fields) {
            System.out.println(f);
            System.out.println(f.getName());
        }
    }
}
