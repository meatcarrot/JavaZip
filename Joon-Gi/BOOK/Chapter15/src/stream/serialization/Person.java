package stream.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -1503252402544036183L;
    String name;
    String job;
    // transient String job;

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name + ", " + job;
    }
}
