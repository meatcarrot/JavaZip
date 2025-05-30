package map.treemap;

import collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서훤");
        Member memberHong= new Member(1004, "홍길동");

        memberTreeMap.addMember(memberHong);
        memberTreeMap.addMember(memberSon);
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberPark);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1003);
        memberTreeMap.showAllMember();
    }
}
