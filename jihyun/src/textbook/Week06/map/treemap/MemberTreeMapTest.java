package textbook.Week06.map.treemap;

import textbook.Week06.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();
        // MemberTreeMap 클래스내에 제네릭 타입이 선언되어 있기 때문에 여기서 <>를 쓰지 않음

        Member memberPark = new Member(1003, "박서희");
        Member memberLee = new Member(1001, "이지원");
        Member memberHong = new Member(1004, "홍길동");
        Member memberSon = new Member(1002, "손민국");

        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberHong);
        memberTreeMap.addMember(memberSon);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();
    }
}
