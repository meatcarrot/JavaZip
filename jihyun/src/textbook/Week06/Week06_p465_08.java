package textbook.Week06;

import java.util.ArrayList;
import java.util.Iterator;

public class Week06_p465_08 {
    public static void main(String[] args) {
        ArrayList_ arrayList = new ArrayList_();

        Member_ memberLee = new Member_(1001, "이지원");
        Member_ memberSon = new Member_(1002, "손민국");
        Member_ memberPark = new Member_(1003, "박서희");
        Member_ memberHong = new Member_(1004, "홍길동");

        arrayList.addMember(memberLee);
        arrayList.addMember(memberSon);
        arrayList.addMember(memberPark);
        arrayList.addMember(memberHong);

        arrayList.showAllMember();

        arrayList.removeMember(memberHong.getMemberId());
        arrayList.showAllMember();

        arrayList.insertMember(memberHong, 1);
        arrayList.showAllMember();
    }
}

class ArrayList_ {
    private ArrayList<Member_> arrayList = new ArrayList<>();

    public void addMember(Member_ member) {
        arrayList.add(member);
    }

    public void insertMember(Member_ member, int index) {
        if(index < 0 || index > arrayList.size() + 1) {
            System.out.println("지정된 자리에 추가할 수 없습니다.");
            return ;
        }
        arrayList.add(index-1, member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member_> ir = arrayList.iterator();

        while(ir.hasNext()) {
            Member_ member = ir.next();
            int tempId = member.getMemberId();

            if(tempId == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(Member_ member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}

class Member_ {
    private int memberId;
    private String memberName;

    public Member_ (int memberId, String memberName) {
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
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals (Object obj) {
        if(obj instanceof Member_) {
            Member_ member = (Member_)obj;
            if(member.memberId == this.memberId)
                return true;
        }
        return false;
    }
}