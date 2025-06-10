package ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {

    public String name;
    public int age;


    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
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

public class week05_p404_09 {
    public static void main(String[] args) {

        Class personClass = Person.class;

        Constructor[] cons = personClass.getConstructors();
        for(Constructor c : cons) {
            System.out.println(c);
        }

        Method[] methods = personClass.getMethods();
        for(Method m : methods) {
            System.out.println(m);
        }

        Field[] fields = personClass.getFields();
        for(Field f : fields) {
            System.out.println(f);
            System.out.println(f.getName());
        }
    }
}
