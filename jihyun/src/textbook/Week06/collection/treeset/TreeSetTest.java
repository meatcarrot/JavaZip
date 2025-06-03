package textbook.Week06.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for(String str : treeSet) {
            System.out.println(str);
        }
        // TreeSet은 사전순 정렬되어 저장하고, 결과를 출력함(자동 오름차순)
        // 정렬을 구현하기 위해 이진 트리를 사용
        // 이진 검색트리는 노드에 저장되는 자료의 중복을 허용하지 않음
        // 왼쪽 자식 노드는 부모 노드보다 값이 항상 작고,
        // 오른쪽 자식 노드는 부모 노드보다 값이 항상 큼
        // 부모 노드는 자식 노드를 2개 이하로 가질 수 있음
    }
}
