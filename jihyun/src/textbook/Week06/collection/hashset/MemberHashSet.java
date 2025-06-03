package textbook.Week06.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import textbook.Week06.collection.Member;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = hashSet.iterator(); // Iterator를 활용해 HashSet 요소를 순회

        while(ir.hasNext()) { // 순회 요소가 더 있는지 체크하는 메서드
            Member member = ir.next(); // 다음에 있는 요소를 반환

            int tempId = member.getMemberId();
            if(tempId == memberId) {
                hashSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println( );
    }
}
