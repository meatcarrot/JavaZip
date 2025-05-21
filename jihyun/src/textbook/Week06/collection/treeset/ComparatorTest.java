package textbook.Week06.collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new MyCompare());
        // Set은 중복을 허용하지 않는 자료구조 (인터페이스)
        // TreeSet은 Set의 종류 중 하나. (값을 저장하면서 자동 정렬 수행해주는 자료구조)
        // new MyCompare() : 정렬 기준을 지정해주는 코드 (Comparator 사용할 때 매개변수로 반드시 전달해주어야 함)

        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        System.out.println(set);
    }
}

class MyCompare implements Comparator<String> {
    public int compare(String s1, String s2) {
        return (s1.compareTo(s2) * -1); // 내림차순으로 정렬
    }
    // String 클래스의 경우, Comparable 인터페이스의 compareTo() 메서드가 이미 구현되어 있지만
    // final로 선언되어 있어서 오름차순 정렬을 내림차순 정렬로 재정의할 수 없음.
    // 이러한 경우 Comparator 인터페이스를 사용하여 compareTo() 메서드 오버라이딩하여 재정의 가능
}