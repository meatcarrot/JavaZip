package textbook.Week06.map.hashmap;

import textbook.Week06.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서희");
        Member memberHong = new Member(1004, "홍길동");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberPark);
        memberHashMap.addMember(memberHong);

        memberHashMap.showAllMember();
        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
// 출력값이 순서대로 나온 것은 운이 좋은 것일 뿐 절대 보장된 결과가 아님
// hashmap은 정렬되지 않고 랜덤으로 저장됨. 속도 빠름 (O(1))