package textbook.Week06;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Week06_p465_09 {
    public static void main(String[] args) {
        TreeSet_ treeSet = new TreeSet_();

        Member3 memberPark = new Member3(1003, "박서희");
        Member3 memberLee = new Member3(1001, "이지원");
        Member3 memberSon = new Member3(1002, "손민국");
        Member3 memberKim = new Member3(1004, "김지현");

        treeSet.addMember(memberPark);
        treeSet.addMember(memberLee);
        treeSet.addMember(memberSon);
        treeSet.addMember(memberKim);

        treeSet.showAllMember();

        treeSet.removeMember(memberPark.getMemberId());
        treeSet.showAllMember();

        Member3 memberHong = new Member3(1003, "홍길동");

        treeSet.addMember(memberHong);
        treeSet.showAllMember();
    }
}

class TreeSet_ {
    private Set<Member3> treeSet = new TreeSet<Member3>();

    public void addMember(Member3 member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member3> ir = treeSet.iterator();

        while(ir.hasNext()) {
            Member3 member = ir.next();
            int tempId = member.getMemberId();

            if(tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(Member3 member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}

class Member3 implements Comparable<Member3> {
    private int memberId;
    private String memberName;

    public Member3 (int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public int compareTo(Member3 member) {
        return this.memberName.compareTo(member.memberName);
    }
}