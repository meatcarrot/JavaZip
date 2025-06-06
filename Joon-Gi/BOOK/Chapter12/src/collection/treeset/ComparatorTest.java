package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return (s1.compareTo(s2)) * (-1);
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new MyCompare());

        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);
    }
}
