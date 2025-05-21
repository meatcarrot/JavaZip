package textbook.Week06.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import textbook.Week06.collection.Member;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) { // HashMap에 회원을 추가하는 메서드
        hashMap.put(member.getMemberId(), member); // put(key, value) : key-value 쌍으로 데이터를 저장하는 메서드
    } // 객체 자체를 value 값으로 넣어서 다른 인스턴스 사용 가능케 함

    public boolean removeMember(int memberId) {
        if(hashMap.containsKey(memberId)) { // containsKey(key) : 이 키가 HashMap에 존재하는지 확인하는 메서드
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        // Iterator는 인터페이스. Set, List, Map 같은 컬렉션을 순서대로 탐색할 수 있는 도구
        // iterator()는 Set, List, Map 같은 컬렉션에서 Iterator 객체를 꺼내는 메서드 (반복문 돌릴 수 있음)
        // keySet() : hashMap에 있는 모든 key 값들만 뽑아낸 집합(Set) 객체를 반환
        // ir은 key 값들을 하나씩 꺼낼 수 있는 '도구' (반복기)

        while(ir.hasNext()) { // hasNext() : 다음에 더 꺼낼게 있는지 확인 (boolean)
            int key = ir.next(); // next() : 실제로 다음 값을 꺼내는 메서드
            Member member = hashMap.get(key); // get(key) : key 값에 해당하는 value를 가져오는 메서드

            System.out.println(member);
        }
        System.out.println();
    }
}
// map.keySet() : 모든 Key 값만 모아서 반환 -> 중복 불가하므로 Set 객체로 반환 (인터페이스)
// map.values() : 모든 value 값만 모아서 반환 -> 중복 가능하므로 Collection 객체로 반환 (인터페이스)
// map.entrySet() : key-value 쌍 전체를 반환 -> key 기준 중복 불가하여 Set 객체로 반환

// collection 인터페이스 --> 하나씩 저장하는 자료구조만 포함됨 (Map은 키-값 쌍으로 저장되어 완전히 다른 계열의 자료구조)
// ㄴ List(인터페이스) -> ArrayList(클래스), LinkedList(클래스)
// ㄴ Set(인터페이스) -> HashSet(클래스), TreeSet(클래스)
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// Map 인터페이스 -> HashMap(클래스), TreeMap(클래스), LinkedHashMap(클래스)